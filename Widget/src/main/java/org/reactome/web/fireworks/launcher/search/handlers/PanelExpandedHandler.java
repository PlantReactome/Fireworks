package org.reactome.web.fireworks.launcher.search.handlers;

import com.google.gwt.event.shared.EventHandler;
import org.reactome.web.fireworks.launcher.search.events.PanelExpandedEvent;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface PanelExpandedHandler extends EventHandler {
    void onPanelExpanded(PanelExpandedEvent event);
}
