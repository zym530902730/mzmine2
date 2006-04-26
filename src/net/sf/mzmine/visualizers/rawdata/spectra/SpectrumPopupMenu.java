/**
 * 
 */
package net.sf.mzmine.visualizers.rawdata.spectra;

import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import net.sf.mzmine.visualizers.rawdata.spectra.SpectrumPlot.PlotMode;


/**
 *
 */
class SpectrumPopupMenu extends JPopupMenu {
    
    private JMenuItem zoomOutMenuItem;
    private JMenuItem showDataPointsMenuItem;
    private JMenuItem plotTypeMenuItem;
    private JMenuItem annotationsMenuItem;
    
    SpectrumPopupMenu(SpectrumVisualizer masterFrame) {
        
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        zoomOutMenuItem = new JMenuItem("Zoom out");
        zoomOutMenuItem.addActionListener(masterFrame);
        zoomOutMenuItem.setActionCommand("ZOOM_OUT");
        zoomOutMenuItem.setEnabled(false);
        add(zoomOutMenuItem);
        
        addSeparator();

        annotationsMenuItem = new JMenuItem("Hide peak values");
        annotationsMenuItem.addActionListener(masterFrame);
        annotationsMenuItem.setActionCommand("SHOW_ANNOTATIONS");
        add(annotationsMenuItem);
        
        plotTypeMenuItem = new JMenuItem("Show as centroid");
        plotTypeMenuItem.addActionListener(masterFrame);
        plotTypeMenuItem.setActionCommand("SET_PLOT_MODE");
        add(plotTypeMenuItem);
        
        showDataPointsMenuItem = new JMenuItem("Show data points");
        showDataPointsMenuItem.setActionCommand("SHOW_DATA_POINTS");
        showDataPointsMenuItem.addActionListener(masterFrame);
        add(showDataPointsMenuItem);
        
    }
    
    void setPlotModeMenuItem(String text) {
        plotTypeMenuItem.setText(text);
    }
    
    void setDataPointsMenuItem(String text) {
        showDataPointsMenuItem.setText(text);
    }
    
    void setZoomOutMenuItem(boolean enabled) {
        zoomOutMenuItem.setEnabled(enabled);
    }
    
    void setAnnotationsMenuItem(String text) {
        annotationsMenuItem.setText(text);
    }
    
}
