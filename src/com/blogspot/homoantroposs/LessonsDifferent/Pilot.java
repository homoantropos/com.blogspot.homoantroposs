package com.blogspot.homoantroposs.LessonsDifferent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pilot extends JFrame {
    private JTextField f1, f2, f3;
    private JButton b1;
    static int a;
    static int b;

    public static void main(String[] args) {

        JFrame fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);

        JButton b1 = new JButton("Вычислить");
        final JTextField f1 = new JTextField(10);
        final JTextField f2 = new JTextField(10);
        final JTextField f3 = new JTextField(10);
        fr.add(b1);
        fr.add(f1);
        fr.add(f2);
        fr.add(f3);

        fr.setSize(500, 150);
        fr.setVisible(true);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(f1.getText());
                b = Integer.parseInt(f2.getText());
                f3.setText(String.valueOf(a + b));
            }
        });

    }
}