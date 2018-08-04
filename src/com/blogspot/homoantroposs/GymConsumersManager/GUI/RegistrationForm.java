package com.blogspot.homoantroposs.GymConsumersManager.GUI;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Facilities.Memoryzator;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.UserMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class RegistrationForm extends JFrame {

    String firstName;
    String name;
    Integer yearOfBirth;
    Integer monthOfBirth;
    Integer dayOfBirth;
    LocalDate dOb;
    Genders gender;
    String phoneNumber;

    public RegistrationForm () {

        super("РЕЄСТРАЦІЯ УЧНЯ");

        setDefaultCloseOperation(HIDE_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        int height = d.height;
        int width = d.width;
        setResizable(false);
        setSize(390, 370);
        setVisible(true);

        JPanel main = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;

        JPanel firstNameP = new JPanel(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.weightx = 0.1;
        g.fill = GridBagConstraints.BOTH;
        JPanel gap0 = new JPanel();
        JPanel nameP = new JPanel(new GridBagLayout());
        GridBagConstraints cg = new GridBagConstraints();
        cg.weightx = 0.1;
        cg.fill = GridBagConstraints.BOTH;
        JLabel gap1 = new JLabel("");
        JPanel dObP = new JPanel();
        JPanel gap2 = new JPanel();
        JPanel genderPhoneP = new JPanel();
        JPanel gap3 = new JPanel();
        JPanel phone = new JPanel();
        JPanel gap4 = new JPanel();
        JPanel regBut = new JPanel();

        JLabel firstNameL = new JLabel("ПРІЗВИЩЕ: ");
        firstNameL.setHorizontalAlignment(JLabel.RIGHT);
        JTextField firstNameT = new JTextField(20);
        g.gridx = 0;
        firstNameP.add(firstNameL, g);
        g.gridx = 1;
        firstNameP.add(firstNameT, g);
        c.gridx = 0;
        c.gridy = 0;
        main.add(firstNameP, c);
        c.gridy = 1;
        main.add(gap0, c);

        JLabel nameL = new JLabel("         ІМ'Я: ");
        nameL.setHorizontalAlignment(JLabel.RIGHT);
        JTextField nameT = new JTextField(20);
        cg.gridx = 0;
        nameT.setEnabled(false);
        nameP.add(nameL, cg);
        cg.gridx = 1;
        nameP.add(nameT, cg);
        c.gridy = 2;
        main.add(nameP, c);

        c.gridy = 3;
        main.add(gap1, c);

        JLabel bornL = new JLabel("НАРОДИВСЯ:  рік:");
        JTextField yearOfBirthT = new JTextField(4);
        yearOfBirthT.setEnabled(false);
        JLabel monthL = new JLabel("місяць:");
        JTextField monthOfBirthT = new JTextField(2);
        monthOfBirthT.setEnabled(false);
        JLabel dayL = new JLabel("день:");
        JTextField dayOfBirthT = new JTextField(2);
        dayOfBirthT.setEnabled(false);

        dObP.add(bornL);
        dObP.add(yearOfBirthT);
        dObP.add(monthL);
        dObP.add(monthOfBirthT);
        dObP.add(dayL);
        dObP.add(dayOfBirthT);
        c.gridy = 4;
        main.add(dObP, c);
        c.gridy = 5;
        main.add(gap2, c);

        JLabel genderL = new JLabel("СТАТЬ:");
        JPanel sexP = new JPanel();
        ButtonGroup sexB = new ButtonGroup();
        JRadioButton sexM = new JRadioButton("Ч");
        sexM.setEnabled(false);
        JRadioButton sexF = new JRadioButton("Ж");
        sexF.setEnabled(false);
        sexB.add(sexM);
        sexB.add(sexF);
        genderPhoneP.add(genderL);
        genderPhoneP.add(sexM);
        genderPhoneP.add(sexF);
        c.gridy = 6;
        main.add(genderPhoneP, c);
        c.gridy = 7;
        main.add(gap3, c);

        JTextField phoneNumberT = new JTextField(20);
        JLabel phoneL = new JLabel("ТЕЛЕФОН:");
        phone.add(phoneL);
        phone.add(phoneNumberT);
        phoneNumberT.setEnabled(false);
        c.gridy = 8;
        main.add(phone, c);
        c.gridy = 9;
        main.add(gap4, c);

        JButton createB = new JButton("Додати учня");
        createB.setEnabled(false);
        regBut.add(createB);
        c.gridy = 10;
        c.weightx = 0.0;
        main.add(regBut, c);

        firstNameT.addActionListener(event -> {
            firstName =firstNameT.getText();
            firstNameT.setEnabled(false);
            nameT.setEnabled(true);
            nameT.requestFocus();});

        nameT.addActionListener(event -> {
            name = nameT.getText();
            nameT.setEnabled(false);
            yearOfBirthT.requestFocus();
            yearOfBirthT.setEnabled(true);
        });

        yearOfBirthT.addActionListener(event -> {
            try {yearOfBirth = Integer.parseInt(yearOfBirthT.getText());
                yearOfBirthT.setEnabled(false);
                monthOfBirthT.setEnabled(true);
                monthOfBirthT.requestFocus();
            }catch (NumberFormatException ex) {
                TextAreaInfo are = new TextAreaInfo("ВВЕДІТЬ ПОВНИЙ РІК НАРОДЖЕННЯ, ЛІТЕРИ ТА ІНШІ СИМВОЛИ НЕПРИПУСТИМІ", "ПОПЕРЕДЖЕННЯ");
                are.setSize(300, 50);
                yearOfBirthT.setText("");
                yearOfBirthT.requestFocus();
            }
        });

        monthOfBirthT.addActionListener(event -> {
            try {monthOfBirth = Integer.parseInt(monthOfBirthT.getText());
                monthOfBirthT.setEnabled(false);
                dayOfBirthT.setEnabled(true);
                dayOfBirthT.requestFocus();
            }catch (NumberFormatException ex) {
                TextAreaInfo are = new TextAreaInfo("ВВЕДІТЬ НОМЕР МІСЯЦЯ, ЛІТЕРИ ТА ІНШІ СИМВОЛИ НЕПРИПУСТИМІ", "ПОПЕРЕДЖЕННЯ");
                are.setSize(300, 50);
                monthOfBirthT.setText("");
                monthOfBirthT.requestFocus();
            }
        });

        dayOfBirthT.addActionListener(event -> {
            try {dayOfBirth = Integer.parseInt(dayOfBirthT.getText());
                dayOfBirthT.setEnabled(false);
                dOb = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
                sexM.setEnabled(true);
                sexF.setEnabled(true);
                sexM.requestFocus();
            } catch (NumberFormatException ex){
                TextAreaInfo are = new TextAreaInfo("ВВЕДІТЬ НОМЕР МІСЯЦЯ, ЛІТЕРИ ТА ІНШІ СИМВОЛИ НЕПРИПУСТИМІ", "ПОПЕРЕДЖЕННЯ");
                are.setSize(300, 50);
                dayOfBirthT.setText("");
                dayOfBirthT.requestFocus();
            }
        });

        sexM.addActionListener(event -> {
            gender = Genders.MAIL;
            sexM.setEnabled(false);
            sexF.setEnabled(false);
            phoneNumberT.setEnabled(true);
            phoneNumberT.requestFocus();
        });

        sexF.addActionListener(event -> {
            gender = Genders.FEMAIL;
            sexF.setEnabled(false);
            sexM.setEnabled(false);
            phoneNumberT.setEnabled(true);
            phoneNumberT.requestFocus();
        });

        phoneNumberT.addActionListener(event -> {
            phoneNumber = phoneNumberT.getText();
            createB.setEnabled(true);
            createB.requestFocus();
        });

        createB.addActionListener(event -> {
            Student student = new Student(firstName, name, dOb, gender, phoneNumber);
            BaseOfGroups.getBaseOfGroups().get(0).getStudents().add(student);
            Memoryzator.passBaseOfGroupToMemory();
            firstNameT.setText("");
            nameT.setText("");
            yearOfBirthT.setText("");
            monthOfBirthT.setText("");
            dayOfBirthT.setText("");
            sexM.setSelected(false);
            sexF.setSelected(false);
            phoneNumberT.setText("");
            createB.setEnabled(false);
            firstNameT.setEnabled(true);
            firstNameT.requestFocus();
        });

        getContentPane().add(BorderLayout.CENTER, main);
    }
}
