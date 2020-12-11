package cli.exporter;

import cli.CLIContainer;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.nio.AttributeType;
import org.jgrapht.nio.graphml.GraphMLExporter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exporter {

    public static void exportTopology(File outputFile, SiteAccessControlSystem system) throws IOException {
        Graph<SecurityZoneVertexTopology, DefaultEdge> exportGraph = new DefaultDirectedGraph<>(DefaultEdge.class);
        Map<String, SecurityZoneVertexTopology> vertexMap = new HashMap<>();

        for(SecurityZone zone: system.getTopology().getSecurityZones()) {
            SecurityZoneVertexTopology vertex = new SecurityZoneVertexTopology(zone);
            exportGraph.addVertex(vertex);
            vertexMap.put(zone.getName(), vertex);
        }

        for (SecurityZone zone: system.getTopology().getSecurityZones()) {
            for(SecurityZone reachable: zone.getReachable()) {
                exportGraph.addEdge(vertexMap.get(zone.getName()), vertexMap.get(reachable.getName()));
            }
        }

        GraphMLExporter<SecurityZoneVertexTopology, DefaultEdge> exporter = new GraphMLExporter<SecurityZoneVertexTopology, DefaultEdge>();
        //exporter.registerAttribute("label", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.registerAttribute("nodegraphics", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.setVertexAttributeProvider((SecurityZoneVertexTopology vertex) -> vertex.getAttributeMap());
        exporter.exportGraph(exportGraph, outputFile);

        Scanner sc = new Scanner(outputFile);
        //instantiating the StringBuffer class
        StringBuffer buffer = new StringBuffer();
        //Reading lines of the file and appending them to StringBuffer
        sc.nextLine(); //skip first line
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        //closing the Scanner object
        sc.close();
        //Replacing the old line with new line

        fileContents = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">\n"
                + fileContents;
        fileContents = fileContents.replace("<key id=\"key0\" for=\"node\" attr.name=\"nodegraphics\" attr.type=\"string\"/>",
                "<key attr.name=\"Description\" attr.type=\"string\" for=\"graph\" id=\"d0\"/>\n" +
                        "  <key for=\"port\" id=\"d1\" yfiles.type=\"portgraphics\"/>\n" +
                        "  <key for=\"port\" id=\"d2\" yfiles.type=\"portgeometry\"/>\n" +
                        "  <key for=\"port\" id=\"d3\" yfiles.type=\"portuserdata\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"node\" id=\"d4\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"node\" id=\"d5\"/>\n" +
                        "  <key for=\"node\" id=\"d6\" yfiles.type=\"nodegraphics\"/>\n" +
                        "  <key for=\"graphml\" id=\"d7\" yfiles.type=\"resources\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"edge\" id=\"d8\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"edge\" id=\"d9\"/>\n" +
                        "  <key for=\"edge\" id=\"d10\" yfiles.type=\"edgegraphics\"/>");
        //instantiating the FileWriter class
        fileContents = fileContents.replaceAll("key0", "d6");
        fileContents = fileContents.replaceAll("&lt;", "<");
        fileContents = fileContents.replaceAll("&gt;", ">");

        FileWriter writer = new FileWriter(outputFile.getPath());
        writer.append(fileContents);
        writer.flush();
    }

    public static void exportReachability(User user, Scenario scenario, File outputFile, SiteAccessControlSystem system) throws IOException {
        Graph<SecurityZoneVertexReachability, DefaultEdge> exportGraph = new DefaultDirectedGraph<>(DefaultEdge.class);
        Map<String, SecurityZoneVertexReachability> vertexMap = new HashMap<>();

        for(SecurityZone zone: system.getTopology().getSecurityZones()) {
            boolean isAccessible = !CLIContainer.getInstance().getEngine().getMatcher(SecurityZoneAccessible.instance()).getAllMatches(user, scenario, zone).isEmpty();
            boolean isLeavable = !CLIContainer.getInstance().getEngine().getMatcher(SecurityZoneLeavable.instance()).getAllMatches(user, scenario, zone).isEmpty();
            boolean hasPermission = !CLIContainer.getInstance().getEngine().getMatcher(USO.instance()).getAllMatches(user, scenario, zone).isEmpty();
            int authenticationStatus = CLIContainer.getInstance().getEngine().getMatcher(SecurityZoneAccessStatus.instance()).getOneArbitraryMatch(scenario, zone, null).get().getStatus();
            SecurityZoneVertexReachability vertex = new SecurityZoneVertexReachability(zone, isAccessible, isLeavable, hasPermission, authenticationStatus);
            exportGraph.addVertex(vertex);
            vertexMap.put(zone.getName(), vertex);
        }

        for (SecurityZone zone: system.getTopology().getSecurityZones()) {
            for(SecurityZone reachable: zone.getReachable()) {
                exportGraph.addEdge(vertexMap.get(zone.getName()), vertexMap.get(reachable.getName()));
            }
        }

        GraphMLExporter<SecurityZoneVertexReachability, DefaultEdge> exporter = new GraphMLExporter<SecurityZoneVertexReachability, DefaultEdge>();
        //exporter.registerAttribute("label", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.registerAttribute("nodegraphics", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.setVertexAttributeProvider((SecurityZoneVertexReachability vertex) -> vertex.getAttributeMap());
        exporter.exportGraph(exportGraph, outputFile);

        Scanner sc = new Scanner(outputFile);
        //instantiating the StringBuffer class
        StringBuffer buffer = new StringBuffer();
        //Reading lines of the file and appending them to StringBuffer
        sc.nextLine(); //skip first line
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        //closing the Scanner object
        sc.close();
        //Replacing the old line with new line

        fileContents = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">\n"
                + fileContents;
        fileContents = fileContents.replace("<key id=\"key0\" for=\"node\" attr.name=\"nodegraphics\" attr.type=\"string\"/>",
                "<key attr.name=\"Description\" attr.type=\"string\" for=\"graph\" id=\"d0\"/>\n" +
                        "  <key for=\"port\" id=\"d1\" yfiles.type=\"portgraphics\"/>\n" +
                        "  <key for=\"port\" id=\"d2\" yfiles.type=\"portgeometry\"/>\n" +
                        "  <key for=\"port\" id=\"d3\" yfiles.type=\"portuserdata\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"node\" id=\"d4\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"node\" id=\"d5\"/>\n" +
                        "  <key for=\"node\" id=\"d6\" yfiles.type=\"nodegraphics\"/>\n" +
                        "  <key for=\"graphml\" id=\"d7\" yfiles.type=\"resources\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"edge\" id=\"d8\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"edge\" id=\"d9\"/>\n" +
                        "  <key for=\"edge\" id=\"d10\" yfiles.type=\"edgegraphics\"/>");
        //instantiating the FileWriter class
        fileContents = fileContents.replaceAll("key0", "d6");
        fileContents = fileContents.replaceAll("&lt;", "<");
        fileContents = fileContents.replaceAll("&gt;", ">");

        FileWriter writer = new FileWriter(outputFile.getPath());
        writer.append(fileContents);
        writer.flush();
    }

    public static void exportAuthorizationPolicy(File outputFile, PolicyModifier modifier) throws IOException {
        Graph<AuthorizationEntityVertex, DefaultEdge> exportGraph = new DefaultDirectedGraph<>(DefaultEdge.class);
        Map<String, AuthorizationEntityVertex> vertexMap = new HashMap<>();

        for(User user: modifier.getSystem().getAuthorizationPolicy().getUsers()) {
            AuthorizationEntityVertex vertex = new AuthorizationEntityVertex(user);
            vertexMap.put(user.getName(), vertex);
            exportGraph.addVertex(vertex);
        }

        for(Role role: modifier.getSystem().getAuthorizationPolicy().getRoles()) {
            AuthorizationEntityVertex vertex = new AuthorizationEntityVertex(role);
            vertexMap.put(role.getName(), vertex);
            exportGraph.addVertex(vertex);
        }

        for(Demarcation demarcation: modifier.getSystem().getAuthorizationPolicy().getDemarcations()) {
            AuthorizationEntityVertex vertex = new AuthorizationEntityVertex(demarcation);
            vertexMap.put(demarcation.getName(), vertex);
            exportGraph.addVertex(vertex);
        }

        for(Permission permission: modifier.getSystem().getAuthorizationPolicy().getPermissions()) {
            AuthorizationEntityVertex vertex = new AuthorizationEntityVertex(permission);
            vertexMap.put(permission.getName(), vertex);
            exportGraph.addVertex(vertex);
        }

        for(Scenario scenario: modifier.getEngine().getMatcher(Scenarios.instance()).getAllValuesOfscenario()) {
            AuthorizationEntityVertex vertex = new AuthorizationEntityVertex(scenario);
            vertexMap.put(scenario.toString(), vertex);
            exportGraph.addVertex(vertex);
        }

        for(User user:  modifier.getSystem().getAuthorizationPolicy().getUsers()) {
            for(Role role: user.getUR()) {
                AuthorizationEntityVertex userVertex = vertexMap.get(user.getName());
                AuthorizationEntityVertex roleVertex = vertexMap.get(role.getName());
                exportGraph.addEdge(userVertex, roleVertex);
            }
        }

        for(Role role:  modifier.getSystem().getAuthorizationPolicy().getRoles()) {
            for(Role juniorRole: role.getJuniors()) {
                AuthorizationEntityVertex roleVertex = vertexMap.get(role.getName());
                AuthorizationEntityVertex juniorVertex = vertexMap.get(juniorRole.getName());
                exportGraph.addEdge(roleVertex, juniorVertex);
            }
        }

        for(RSD.Match match: modifier.getEngine().getMatcher(RSD.instance()).getAllMatches()) {
            AuthorizationEntityVertex roleVertex = vertexMap.get(match.getRole().getName());
            AuthorizationEntityVertex scenarioVertex = vertexMap.get(match.getScenario().toString());
            AuthorizationEntityVertex demarcationVertex = vertexMap.get(match.getDemarcation().getName());
            exportGraph.addEdge(roleVertex, scenarioVertex);
            exportGraph.addEdge(scenarioVertex, demarcationVertex);
        }

        for(Demarcation demarcation:  modifier.getSystem().getAuthorizationPolicy().getDemarcations()) {
            AuthorizationEntityVertex demarcationVertex = vertexMap.get(demarcation.getName());
            for(Demarcation subDemarcation: demarcation.getSubdemarcations()) {
                AuthorizationEntityVertex subDemarcationVertex = vertexMap.get(subDemarcation.getName());
                exportGraph.addEdge(demarcationVertex, subDemarcationVertex);
            }
            for(Permission permission: demarcation.getDP()) {
                AuthorizationEntityVertex permissionVertex = vertexMap.get(permission.getName());
                exportGraph.addEdge(demarcationVertex, permissionVertex);
            }
        }

        GraphMLExporter<AuthorizationEntityVertex, DefaultEdge> exporter = new GraphMLExporter<AuthorizationEntityVertex, DefaultEdge>();
        //exporter.registerAttribute("label", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.registerAttribute("nodegraphics", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.setVertexAttributeProvider((AuthorizationEntityVertex vertex) -> vertex.getAttributeMap());
        exporter.exportGraph(exportGraph, outputFile);

        Scanner sc = new Scanner(outputFile);
        //instantiating the StringBuffer class
        StringBuffer buffer = new StringBuffer();
        //Reading lines of the file and appending them to StringBuffer
        sc.nextLine(); //skip first line
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        //closing the Scanner object
        sc.close();
        //Replacing the old line with new line

        fileContents = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">\n"
                + fileContents;
        fileContents = fileContents.replace("<key id=\"key0\" for=\"node\" attr.name=\"nodegraphics\" attr.type=\"string\"/>",
                "<key attr.name=\"Description\" attr.type=\"string\" for=\"graph\" id=\"d0\"/>\n" +
                        "  <key for=\"port\" id=\"d1\" yfiles.type=\"portgraphics\"/>\n" +
                        "  <key for=\"port\" id=\"d2\" yfiles.type=\"portgeometry\"/>\n" +
                        "  <key for=\"port\" id=\"d3\" yfiles.type=\"portuserdata\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"node\" id=\"d4\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"node\" id=\"d5\"/>\n" +
                        "  <key for=\"node\" id=\"d6\" yfiles.type=\"nodegraphics\"/>\n" +
                        "  <key for=\"graphml\" id=\"d7\" yfiles.type=\"resources\"/>\n" +
                        "  <key attr.name=\"url\" attr.type=\"string\" for=\"edge\" id=\"d8\"/>\n" +
                        "  <key attr.name=\"description\" attr.type=\"string\" for=\"edge\" id=\"d9\"/>\n" +
                        "  <key for=\"edge\" id=\"d10\" yfiles.type=\"edgegraphics\"/>");
        //instantiating the FileWriter class
        fileContents = fileContents.replaceAll("key0", "d6");
        fileContents = fileContents.replaceAll("&lt;", "<");
        fileContents = fileContents.replaceAll("&gt;", ">");

        FileWriter writer = new FileWriter(outputFile.getPath());
        writer.append(fileContents);
        writer.flush();
    }

    public static void exportStaticScenarios(File outputFile, PolicyModifier modifier) throws IOException {
        int i = 0;
        int max_scenario_count = 5;
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            for(Scenarios.Match scenarioMatch: modifier.getEngine().getMatcher(Scenarios.instance()).getAllMatches()) {
                if (i < max_scenario_count) {
                    Scenario scenario = scenarioMatch.getScenario();
                    SiteAccessControlSystem system = modifier.getSystem();
                    ContextContainer contextContainer = system.getContextContainer();
                    MyScenario myScenario = (MyScenario) modifier.getManipulation().createChild(contextContainer, modifier.getEPackage().getContextContainer_MyScenarios(),
                            modifier.getEPackage().getMyScenario());
                    for (ScenarioTemporalContext.Match stMatch : modifier.getEngine().getMatcher(ScenarioTemporalContext.instance())
                            .getAllMatches(scenario, null)) {
                        modifier.getManipulation().addTo(myScenario, modifier.getEPackage().getMyScenario_TemporalContexts(), stMatch.getContext());
                    }
                }
                i++;
            }
            modifier.getResource().save(fos, Collections.emptyMap());
        } catch (ModelManipulationException e) {
            e.printStackTrace();
        }

    }
}
