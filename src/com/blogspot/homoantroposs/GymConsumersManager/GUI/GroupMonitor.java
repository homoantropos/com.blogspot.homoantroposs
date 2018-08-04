package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.UserMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GroupMonitor extends JFrame {
    public GroupMonitor (GroupOfStudents group) {

        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();
        g.fill = GridBagConstraints.BOTH;
        g.weightx = 0.1;
        g.weighty = 0.1;
        g.gridheight = 1;
        Insets setG = new Insets(0, 15, 0, 15);
        g.insets = setG;

        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 3;
        JLabel nameOfGroup = new JLabel(group.getNameOfGroup());
        nameOfGroup.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(nameOfGroup, g);

        JButton attendc = new JButton("Присутність");
        JButton payment = new JButton("Оплата");
        JButton editGrp = new JButton("Редагувати");
        JPanel upperTitle = new JPanel();
        upperTitle.add(attendc);
        upperTitle.add(payment);
        upperTitle.add(editGrp);
        g.gridwidth = 3;
        g.gridy = 1;
        g.gridx = 0;
        mainPanel.add(upperTitle, g);

        JPanel studentsP = new JPanel(new GridBagLayout());
        g.gridheight = 1;
        Integer row = -1;
        for (User u : group.getStudents()) {
            JPanel panel = new JPanel(new GridBagLayout());
            JButton button = new JButton(((Student)u).toString());
            button.addActionListener(event -> new TextAreaInfo(UserMonitor.printUserFullInfo(u), ""));
            g.gridx = 0;
            g.gridy = 0;
            panel.add(button, g);
            g.gridx = 0;
            g.gridy = group.getStudents().indexOf(u);
            studentsP.add(panel, g);
            row++;
        }
        JScrollPane studentsS = new JScrollPane(studentsP);
        studentsS.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        studentsS.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        g.gridy = 2;
        g.gridx = 1;
        g.gridheight = 15;
        mainPanel.add(studentsS, g);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        Integer width = d.width;
        Integer height = d.height;
        setSize(width, height);
        getContentPane().add(BorderLayout.CENTER, mainPanel);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
