package com.blogspot.homoantroposs.LessonsDifferent;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;
import com.blogspot.homoantroposs.Utilites.JFrameBasicSets;

import javax.swing.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MenuLesson {

    public MenuLesson () {}

    private JFrame frame = new JFrame();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu first = new JMenu("Групи");
    private JMenu second = new JMenu("Учні");
    private JMenuItem group = new JMenuItem("ojcm");
    private JTextArea field = new JTextArea();
    private JScrollPane scroll = new JScrollPane();


    public void setMenuBar () {
        ArrayList<GroupOfStudents> base;
        StringBuilder strB = new StringBuilder();
        first.add(group);
        menuBar.add(first);
        menuBar.add(second);
        try {
            FileInputStream fis = new FileInputStream ("base.ser");
            ObjectInputStream ois = new ObjectInputStream (fis);
            base = (ArrayList<GroupOfStudents>) ois.readObject();
            ois.close();
            for (GroupOfStudents grou : base) {
                Integer index = base.indexOf(grou) + 1;
                strB.append("\n" + index + " " + grou.getNameOfGroup() + " " + grou.getStudents().size());
            }
        } catch (Exception e) {
            strB.append("Файлу не знайдено" + "\n" + "lack");
            base = new ArrayList<>();
        }

        field.setText(strB.toString());
        scroll.createVerticalScrollBar();
        scroll.add(field);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, field);
        JFrameBasicSets.setSizeFrame(frame);

    }
}
