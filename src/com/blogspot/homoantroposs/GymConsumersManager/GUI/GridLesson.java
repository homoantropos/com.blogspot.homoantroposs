package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.function.IntConsumer;

public class GridLesson extends JFrame {

    public GridLesson () {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        ArrayList<JButton> buttons = new ArrayList<>();
        createLabels(10, i -> {
            JButton button = new JButton(String.valueOf(i));
            buttons.add(button);
        });

        g.fill = GridBagConstraints.BOTH;
        g.weighty = 1.0;
        g.weightx = 0.1;
        g.gridheight = 1;
        g.gridwidth = 2;

        g.gridy = 0;
        g.gridx = 0;
        panel.add(buttons.get(0), g);

        g.gridy = 0;
        g.gridx = 2;
        panel.add(buttons.get(1), g);

        g.gridy = 0;
        g.gridx = 4;
        panel.add(buttons.get(2), g);

        g.gridy = 1;
        g.gridx = 0;
        panel.add(buttons.get(3), g);

        g.gridy = 1;
        g.gridx = 2;
        panel.add(buttons.get(4), g);

        g.gridy = 1;
        g.gridx = 4;
        panel.add(buttons.get(5), g);

        g.gridy = 2;
        g.gridx = 0;
        panel.add(buttons.get(6), g);

        g.gridy = 2;
        g.gridx = 2;
        panel.add(buttons.get(7), g);

        JLabel label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        g.weightx = 0.1;
        g.gridwidth = 1;
        g.gridy = 2;
        g.gridx = 4;
        panel.add(label, g);

        g.gridwidth = 1;
        g.gridy = 20;
        g.gridx = 5;
        panel.add(buttons.get(8), g);


        getContentPane().add(BorderLayout.CENTER, panel);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        int height = d.height;
        int width = d.width;
        setSize(width, height);
        setVisible(true);
    }
    public void createLabels (int i, IntConsumer cons) {
        for (int j = 0; j < i; j++)
            cons.accept(j);
    }
}
