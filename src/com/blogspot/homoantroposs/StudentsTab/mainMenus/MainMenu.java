package com.blogspot.homoantroposs.StudentsTab.mainMenus;

import com.blogspot.homoantroposs.Utilites.JFrameBasicSets;
import com.blogspot.homoantroposs.StudentsTab.base.BaseMonitor;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudentsCreator;
import com.blogspot.homoantroposs.StudentsTab.persons.StudentsRegistrator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements Runnable {

    String nameOfGroup;
    JTextField nameOfGroupT;
    JButton printGroupB;
    JTextArea monitor;
    JScrollPane scroll;
    StringBuilder strB = new StringBuilder();

    public void run () {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel printGroupP = new JPanel();

        JLabel nameOfGroupL = new JLabel("Назва групи:");

        JButton createNewGroupB = new JButton("Створити групу");

        JButton driveGroupsB = new JButton("Керування групами");

        JButton addNewStudentB = new JButton("Додати учня");

        JButton printBaseB = new JButton("Надрукувати групи");

        printGroupB = new JButton("Склад групи");

        nameOfGroupT = new JTextField(15);

        monitor = new JTextArea();
        scroll = new JScrollPane(monitor);
        scroll.createVerticalScrollBar();

        addNewStudentB.addActionListener(new AddNewStudentListener());
        createNewGroupB.addActionListener(new CreateNewStudentListener());
        printBaseB.addActionListener(new PrintBaseListener());
        printGroupB.addActionListener(new PrintGroupListener());
        nameOfGroupT.addActionListener(new GroupNameListener());

        panel.add(createNewGroupB);
        panel.add(driveGroupsB);
        panel.add(addNewStudentB);

        printGroupP.add(nameOfGroupL);
        printGroupP.add(nameOfGroupT);
        printGroupP.add(printGroupB);
        printGroupP.add(printBaseB);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, printGroupP);
        frame.getContentPane().add(BorderLayout.CENTER, scroll);

        JFrameBasicSets.setSizeFrame(frame);

    }
    class CreateNewStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GroupOfStudentsCreator stReg = new GroupOfStudentsCreator();
                    stReg.run();
        }
    }
    class AddNewStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StudentsRegistrator rgtstr = new StudentsRegistrator();
            rgtstr.run();
        }
    }
    class PrintBaseListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            monitor.setText(BaseMonitor.printOfBaseToString());
        }
    }

    class GroupNameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           nameOfGroup = nameOfGroupT.getText();
           printGroupB.requestFocus();
        }
    }
    class PrintGroupListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            monitor.setText (BaseMonitor.printOfGroupToString(nameOfGroup));
        }
    }
}
