/**
 * 
 */
package net.sf.mzmine.visualizers.rawdata.tic;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 * 
 */
class TICToolBar extends JToolBar {

    private JButton zoomOutButton, showSpectraButton, ticXicButton;

    static final Icon zoomOutIcon = new ImageIcon("zoomouticon.png");
    static final Icon showSpectrumIcon = new ImageIcon("spectrumicon.png");
    static final Icon xicIcon = new ImageIcon("xicicon.png");
    static final Icon ticIcon = new ImageIcon("ticicon.png");

    TICToolBar(TICVisualizer masterFrame) {

        super(JToolBar.VERTICAL);

        setFloatable(false);
        setFocusable(false);
        setMargin(new Insets(5, 5, 5, 5));
        setBackground(Color.white);

        zoomOutButton = new JButton(zoomOutIcon);
        zoomOutButton.setEnabled(false);
        zoomOutButton.setActionCommand("ZOOM_OUT");
        zoomOutButton.setToolTipText("Zoom out");
        zoomOutButton.addActionListener(masterFrame);

        showSpectraButton = new JButton(showSpectrumIcon);
        showSpectraButton.setEnabled(false);
        showSpectraButton.setActionCommand("SHOW_SPECTRUM");
        showSpectraButton.setToolTipText("Show spectrum of selected scan");
        showSpectraButton.addActionListener(masterFrame);

        ticXicButton = new JButton(xicIcon);
        ticXicButton.setActionCommand("CHANGE_XIC_TIC");
        ticXicButton.setToolTipText("Change XIC/TIC mode");
        ticXicButton.addActionListener(masterFrame);

        add(zoomOutButton);
        addSeparator();
        add(showSpectraButton);
        addSeparator();
        add(ticXicButton);

    }

    void setZoomOutButton(boolean enabled) {
        zoomOutButton.setEnabled(enabled);
    }

    void setSpectraButton(boolean enabled) {
        showSpectraButton.setEnabled(enabled);
    }

    void setXicButton(boolean xic) {
        if (xic)
            ticXicButton.setIcon(xicIcon);
        else
            ticXicButton.setIcon(ticIcon);
    }

}
