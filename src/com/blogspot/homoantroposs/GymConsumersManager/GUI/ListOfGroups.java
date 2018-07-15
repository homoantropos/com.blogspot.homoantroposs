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

        for (int i=0; i<n; i++) {
            JLabel label = new JLabel(" ");
            label.setHorizontalAlignment(0);
            p.weightx = 1.0;
            p.weighty = 1.0;
            p.fill = GridBagConstraints.HORIZONTAL;
            p.gridx = i;
            p.gridy = 0;
            p.gridwidth = 1;
            mainPanel.add(label, p);
        }

        Integer row = 0;

        for (GroupOfStudents gos : BaseOfGroups.getBaseOfGroups()) {
            JButton button = new JButton(gos.getNameOfGroup()+" "+gos.getGymAddress());
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new TextAreaInfo (gos.toString(), gos.getNameOfGroup()+" "+gos.getGymAddress());
                }
            });
            JPanel panel = new JPanel();
            p.weightx = 1.0;
            p.weighty = 1.0;
            p.fill = GridBagConstraints.HORIZONTAL;
            p.gridx = 1;
            p.gridy = row + 1;
            p.gridwidth = 1;
            panel.add(button);
            mainPanel.add(panel, p);
            row++;
        }

        setLayout(new GridBagLayout());
        GridBagConstraints f = new GridBagConstraints();
        f.weightx = 1.0;
        f.weighty = 1.0;
        f.fill = GridBagConstraints.BOTH;
        f.gridx = 1;
        f.gridy = row + 1;
        f.gridwidth = 2;
        add (mainPanel, f);
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