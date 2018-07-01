package com.blogspot.homoantroposs.StudentsTab.groups;

import com.blogspot.homoantroposs.StudentsTab.base.BaseManager;
import com.blogspot.homoantroposs.StudentsTab.base.BaseOfGroups;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class GroupOfStudentsCreator implements Runnable {

    private String nameOfGroup;
    private JTextField nameOfGroupT;
    private JButton createGroupB;

    private BaseManager manager = new BaseManager();

    public void run(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel panelGroupP = new JPanel();
        JLabel labelOfGroup = new JLabel("Група:");

        nameOfGroupT = new JTextField(20);
        nameOfGroupT.addActionListener(new NameOfGroupListener());

        createGroupB = new JButton("Створити групу");
        createGroupB.addActionListener(new CreateGroupListener());

        panelGroupP.add(labelOfGroup);
        panelGroupP.add(nameOfGroupT);

        frame.getContentPane().add(BorderLayout.CENTER, panelGroupP);
        frame.getContentPane().add(BorderLayout.SOUTH, createGroupB);

        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    class NameOfGroupListener implements ActionListener {
        public void actionPerformed (ActionEvent nameOfGev) {
            nameOfGroup = nameOfGroupT.getText();
            for (GroupOfStudents grs : BaseOfGroups.getBase())
                if (grs.getNameOfGroup().equals(nameOfGroup)) {
                    System.out.println("Така група вже існує.");
                    nameOfGroupT.requestFocus();
                    createGroupB.setEnabled(false);
                } else {
            createGroupB.setEnabled(true);
            createGroupB.requestFocus();}
        }
    }
    class CreateGroupListener implements ActionListener {
        public void actionPerformed (ActionEvent createEv) {
            GroupOfStudents group = new GroupOfStudents(nameOfGroup);
            manager.addGroup(group);
            nameOfGroupT.setText("");
        }
    }
}
