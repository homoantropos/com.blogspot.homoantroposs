package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import javax.swing.*;
import java.awt.*;

public class TextAreaInfo extends JFrame {

    public TextAreaInfo (String info, String name) {

        super (name);

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane (area);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        area.setText(info);

        getContentPane().add(BorderLayout.CENTER, scroll);
        setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        int scrWidth = d.width;
        int scrHeight = d.height;
        setResizable(true);
        setSize(scrWidth, scrHeight);
        setVisible(true);

    }
}
