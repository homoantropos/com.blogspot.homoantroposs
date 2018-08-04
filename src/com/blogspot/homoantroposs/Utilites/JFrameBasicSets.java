package com.blogspot.homoantroposs.Utilites;

import javax.swing.JFrame;
import java.awt.*;

public class JFrameBasicSets extends JFrame {

    private JFrameBasicSets () {}

    public static void setSizeFrame (JFrame frame) {
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        int scrWidth = d.width;
        int scrHeight = d.height;
        frame.setResizable(true);
        frame.setSize(scrWidth, scrHeight);
        frame.setVisible(true);
    }
}
