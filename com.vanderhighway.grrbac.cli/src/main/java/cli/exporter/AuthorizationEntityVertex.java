package cli.exporter;

import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.jgrapht.nio.Attribute;
import org.jgrapht.nio.AttributeType;
import org.jgrapht.nio.DefaultAttribute;

import java.util.HashMap;
import java.util.Map;

public class AuthorizationEntityVertex {
    private String colour;
    private String label;


    public AuthorizationEntityVertex(String label, String colour) {
        this.label = label;
        this.colour = colour;
    }

    public AuthorizationEntityVertex(User user) {
        this(user.getName(), "#ffcc00");
    }

    public AuthorizationEntityVertex(Role role) {
        this(role.getName(), "#00ccff");
    }

    public AuthorizationEntityVertex(Demarcation demarcation) {
        this(demarcation.getName(), "#008080");
    }

    public AuthorizationEntityVertex(Permission permission) {
        this(permission.getName(), "#00ff00");
    }

    public AuthorizationEntityVertex(Scenario scenario) {
        this(scenario.toString(), "#ff00ff");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, Attribute> getAttributeMap() {
        Map attributeMap = new HashMap();
        String colourHex = this.colour;
        //attributeMap.put("label", new DefaultAttribute(this.getLabel(), AttributeType.STRING));
        attributeMap.put("nodegraphics", new DefaultAttribute(
       "<y:ShapeNode>\n" +
            "          <y:Geometry height=\"80.0\" width=\"80.0\" x=\"2884.4928571428572\" y=\"3950.0\"/>\n" +
            "          <y:Fill color=\"" + colourHex + "\" transparent=\"false\"/>\n" +
            "          <y:BorderStyle color=\"#000000\" raised=\"false\" type=\"line\" width=\"1.0\"/>\n" +
            "          <y:NodeLabel alignment=\"center\" autoSizePolicy=\"content\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"18.701171875\" horizontalTextPosition=\"center\" iconTextGap=\"4\" modelName=\"custom\" textColor=\"#000000\" verticalTextPosition=\"bottom\" visible=\"true\" width=\"23.341796875\" x=\"3.3291015625\" xml:space=\"preserve\" y=\"5.6494140625\">" + this.label + "<y:LabelModel><y:SmartNodeLabelModel distance=\"4.0\"/></y:LabelModel><y:ModelParameter><y:SmartNodeLabelModelParameter labelRatioX=\"0.0\" labelRatioY=\"0.0\" nodeRatioX=\"0.0\" nodeRatioY=\"0.0\" offsetX=\"0.0\" offsetY=\"0.0\" upX=\"0.0\" upY=\"-1.0\"/></y:ModelParameter></y:NodeLabel>\n" +
            "          <y:Shape type=\"rectangle\"/>\n" +
            "        </y:ShapeNode>"
                , AttributeType.STRING));
        return attributeMap;
    }
}
