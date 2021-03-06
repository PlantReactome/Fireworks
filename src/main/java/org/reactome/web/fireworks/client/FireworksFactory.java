package org.reactome.web.fireworks.client;

import com.google.gwt.resources.client.TextResource;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public abstract class FireworksFactory {

    public static boolean CONSOLE_VERBOSE = false;
    public static boolean EVENT_BUS_VERBOSE = false;

    public static boolean SHOW_INFO = false;

    public static boolean EDGES_SELECTABLE = true;
    public static boolean SHOW_DIAGRAM_BTN = true;
    public static boolean OPEN_NODE_ACTION = true;

    public static String SERVER = "";
    public static String ILLUSTRATION_SERVER = "";

    public static boolean RESPOND_TO_SEARCH_SHORTCUT = true; // Listen to ctrl (or cmd) + F
                                                             // and expand the search input

    public static FireworksViewer createFireworksViewer(TextResource json){
        return new FireworksViewerImpl(json.getText());
    }

    public static FireworksViewer createFireworksViewer(String json){
        return new FireworksViewerImpl(json);
    }
}
