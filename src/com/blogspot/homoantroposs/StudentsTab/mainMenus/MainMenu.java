package com.blogspot.homoantroposs.StudentsTab.mainMenus;

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

    public void run () {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel printGroupP = new JPanel();

        JLabel nameOfGroupL = new JLabel("Назва групи:");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton createNewGroupB = new JButton("Створити групу");

        JButton driveGroupsB = new JButton("Керування групами");

        JButton addNewStudentB = new JButton("Додати учня");

        JButton printBaseB = new JButton("Всі групи");

        printGroupB = new JButton("Склад групи");

        nameOfGroupT = new JTextField(15);

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

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.EAST, printBaseB);
        frame.getContentPane().add(BorderLayout.NORTH, printGroupP);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        frame.setResizable(true);
        frame.setSize(screenWidth, screenHeight);
        frame.setVisible(true);

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
            BaseMonitor.printOfBase();
        }
    }
    class GroupNameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           nameOfGroup = nameOfGroupT.getText();
           printGroupB.requestFocus();
        }
    }
    class PrintGroupListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            BaseMonitor.printOfGroup(nameOfGroup);
        }
    }
}
