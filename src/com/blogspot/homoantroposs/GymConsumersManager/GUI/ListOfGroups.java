package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfGroups extends JFrame {

    public ListOfGroups (Integer n) {

        super("ПЕРЕЛІК ГРУП");

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints p = new GridBagConstraints();
        p.gridy = 0;
        p.weightx = 0.1;
        p.weighty = 0.1;
        p.fill = GridBagConstraints.BOTH;
        Insets set = new Insets(15, 15, 15, 15);
        p.insets = set;
        p.gridwidth = 1;

        JPanel groups = new JPanel(new GridBagLayout());

        for (int i=0; i<n; i++) {
            JLabel label = new JLabel(String.valueOf(" "));
            p.gridx = i;
            mainPanel.add(label, p);
        }

        Integer row = -1;

        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups()) {
            JButton button = new JButton(gos.getNameOfGroup()+" "+gos.getGymAddress());
            button.addActionListener(event -> new GroupMonitor(gos));
            JPanel panel = new JPanel(new GridBagLayout());
            p.gridx = 0;
            p.gridy = 0;
            panel.add(button, p);
            p.gridx = 0;
            p.gridy = row + 1;
            groups.add(panel, p);
            row++;
        }
        JScrollPane groupsS = new JScrollPane(groups);
        groupsS.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        groupsS.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        p.gridheight = 5;
        p.gridx = 1;
        p.gridy = 1;

        mainPanel.add(groupsS, p);

        JButton reestration = new JButton("Реєстрація учня");
        reestration.addActionListener(event -> new RegistrationForm());
        JPanel firstPanel = new JPanel();
        p.weightx = 0.1;
        p.gridx = 1;
        p.gridy = 100;
        p.fill = GridBagConstraints.NONE;
        mainPanel.add(reestration, p);

        getContentPane().add(BorderLayout.CENTER, mainPanel);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        int scrWidth = d.width;
        int scrHeight = d.height;
        setResizable(true);
        setSize(scrWidth, scrHeight);
        setVisible(true);
    }
}