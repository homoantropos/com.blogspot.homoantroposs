package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import javax.swing.*;
import java.awt.*;

import  com.blogspot.homoantroposs.GymConsumersManager.ExcamplesForMainCreator;

public class ExamplesMain extends JFrame {
    public ExamplesMain () {

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setSize(150, 500);

        GridBagConstraints g = new GridBagConstraints();
        g.weightx = 0.1;
        g.weighty = 0.1;
        Insets set = new Insets(10, 10, 10, 10);
        g.insets = set;
        g.gridx = 0;
        g.fill = GridBagConstraints.BOTH;

        JButton showGroups = new JButton("Показати групи");
        JButton checkAtten = new JButton("Відмітити відвідуваність");
        JButton createBase = new JButton("Створити базу");

        g.gridy = 0;
        mainPanel.add(showGroups, g);

        g.gridy = 1;
        mainPanel.add(checkAtten, g);

        g.gridy = 2;
        mainPanel.add(createBase, g);

        showGroups.addActionListener(event -> new ListOfGroups(3));
        createBase.addActionListener(event -> ExcamplesForMainCreator.createTHeBase());
        checkAtten.addActionListener(event -> ExcamplesForMainCreator.checkAttendanceForAllGroup());

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        Integer height = d.height;
        Integer width = d.width;
        getContentPane().add(BorderLayout.CENTER, mainPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(width, height);
        setResizable(true);
        setVisible(true);

    }
}
