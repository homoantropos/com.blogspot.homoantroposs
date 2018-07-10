package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.Utilites.JFrameBasicSets;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListLesson {

    private ListLesson () {}

    public static JFrame createList () {
        JFrame frame = new JFrame();

        ArrayList <String> namesOfGroups = new ArrayList<>();
        for (GroupOfStudents g : BaseOfGroups.getBaseOfGroups())
            namesOfGroups.add(g.getNameOfGroup());
        JList list = new JList(namesOfGroups.toArray());
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setVisibleRowCount(2);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.createVerticalScrollBar();
        scrollPane.setPreferredSize(new Dimension(150, 50));
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        JFrameBasicSets.setSizeFrame(frame);
        return frame;
    }

}
