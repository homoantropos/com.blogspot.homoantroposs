package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.BaseOfGroupsMonitor;
import com.blogspot.homoantroposs.Utilites.JFrameBasicSets;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;

public class ListLesson extends JFrame {

    JList list;

    public ListLesson() {

        ArrayList<String> groups = new ArrayList<>();

        for (GroupOfStudents g : BaseOfGroups.getBaseOfGroups()){
            String nGroup = g.getNameOfGroup() + " " + g.getGymAddress();
            groups.add(nGroup);
    }
        String [] but = groups.toArray(new String[groups.size()]);
        JList <String> list = new JList(but);

        list.addListSelectionListener(listevent -> {
            String name = list.getSelectedValue();
            new TextAreaInfo(name, "");
        });

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setVisibleRowCount(2);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.createVerticalScrollBar();
        scrollPane.setPreferredSize(new Dimension(150, 50));
        getContentPane().add(BorderLayout.CENTER, list);
        JFrameBasicSets.setSizeFrame(this);
    }

}