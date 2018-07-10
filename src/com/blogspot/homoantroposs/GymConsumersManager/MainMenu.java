package com.blogspot.homoantroposs.GymConsumersManager;

import com.blogspot.homoantroposs.Utilites.JFrameBasicSets;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class MainMenu {
    JFrame frame = new JFrame();
    JPanel mainPanel = new JPanel();

    public void run() {
      int r = 130;
      byte b = (byte) r;
        System.out.println(b);
        BoxLayout layout = new BoxLayout (mainPanel, BoxLayout.PAGE_AXIS);
        mainPanel.setLayout(layout);

        ArrayList<JPanel> panels = new ArrayList<>();
        ArrayList <JButton> buttons = new ArrayList<>();

        for (int i = 0; i<5; i++) {
            JPanel panel = new JPanel();
            panels.add(panel);
        }
        Integer i = panels.size();

        for (JPanel p : panels) {
                String nameOfButton = valueOf(i);
                JButton button = new JButton(nameOfButton);
                p.add(button);
                i = i-1;
            }

        for (JPanel p : panels)
            mainPanel.add(p);


        frame.getContentPane().add(BorderLayout.EAST, mainPanel);
        JFrameBasicSets.setSizeFrame(frame);
    }
}
