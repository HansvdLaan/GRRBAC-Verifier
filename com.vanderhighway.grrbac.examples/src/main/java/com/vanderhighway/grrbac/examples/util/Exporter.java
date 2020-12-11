package com.vanderhighway.grrbac.examples.util;

import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.nio.AttributeType;
import org.jgrapht.nio.graphml.GraphMLExporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exporter {

    public static void exportTopology(File outputFile, SiteAccessControlSystem system) throws IOException {
        Graph<SecurityZoneVertex, DefaultEdge> exportGraph = new DefaultDirectedGraph<>(DefaultEdge.class);
        Map<String, SecurityZoneVertex> vertexMap = new HashMap<>();

        for(SecurityZone zone: system.getTopology().getSecurityZones()) {
            SecurityZoneVertex vertex = new SecurityZoneVertex(zone);
            exportGraph.addVertex(vertex);
            vertexMap.put(zone.getName(), vertex);
        }

        for (SecurityZone zone: system.getTopology().getSecurityZones()) {
            for(SecurityZone reachable: zone.getReachable()) {
                exportGraph.addEdge(vertexMap.get(zone.getName()), vertexMap.get(reachable.getName()));
            }
        }

        GraphMLExporter<SecurityZoneVertex, DefaultEdge> exporter = new GraphMLExporter<SecurityZoneVertex, DefaultEdge>();
        //exporter.registerAttribute("label", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.registerAttribute("nodegraphics", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.setVertexAttributeProvider((SecurityZoneVertex vertex) -> vertex.getAttributeMap());
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

    public static void exportTopology2() throws IOException {
        Graph<SecurityZoneVertex, DefaultEdge> exportGraph = new DefaultDirectedGraph<>(DefaultEdge.class);
        Map<String, SecurityZoneVertex> vertexMap = new HashMap<>();

        SecurityZoneVertex v1 = new SecurityZoneVertex();
        v1.setLabel("testLabel1");
        v1.setColour("blue");

        SecurityZoneVertex v2 = new SecurityZoneVertex();
        v2.setLabel("testLabel2");
        v1.setColour("green");

        exportGraph.addVertex(v1);
        exportGraph.addVertex(v2);
        exportGraph.addEdge(v1, v2);

        File file = new File("./test.graphml");
        GraphMLExporter<SecurityZoneVertex, DefaultEdge> exporter = new GraphMLExporter<SecurityZoneVertex, DefaultEdge>();
        //exporter.registerAttribute("label", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.registerAttribute("nodegraphics", GraphMLExporter.AttributeCategory.NODE, AttributeType.STRING);
        exporter.setVertexAttributeProvider((SecurityZoneVertex vertex) -> vertex.getAttributeMap());
        exporter.exportGraph(exportGraph, file);

        Scanner sc = new Scanner(file);
        //instantiating the StringBuffer class
        StringBuffer buffer = new StringBuffer();
        //Reading lines of the file and appending them to StringBuffer
        sc.nextLine(); //skip first line
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        System.out.println("Contents of the file: "+fileContents);
        //closing the Scanner object
        sc.close();
        String oldLine = "No preconditions and no impediments. Simply Easy Learning!";
        String newLine = "Enjoy the free content";
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

        FileWriter writer = new FileWriter(file.getPath());
        System.out.println("");
        System.out.println("new data: "+fileContents);
        writer.append(fileContents);
        writer.flush();
    }
}
