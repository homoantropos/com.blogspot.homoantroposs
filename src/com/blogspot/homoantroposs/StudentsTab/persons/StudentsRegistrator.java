package com.blogspot.homoantroposs.StudentsTab.persons;

import com.blogspot.homoantroposs.SerializationLesson.Group.GroupCreator;
import com.blogspot.homoantroposs.StudentsTab.base.BaseManager;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudentsCreator;
import com.blogspot.homoantroposs.StudentsTab.utilites.AgeCounter;
import com.blogspot.homoantroposs.Utilites.DatesPeriodsCounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;

public class StudentsRegistrator implements Runnable {

    private JFrame frame;
    private JTextField firstNameT;
    private JTextField lastNameT;
    private JTextField yearT;
    private JTextField monthT;
    private JTextField dayT;
    private JTextField groupSelectionT;
    private JButton registerB;
    private JRadioButton sexM;
    private JRadioButton sexF;

    private String firstName;
    private String lastName;
    private Integer year;
    private Integer month;
    private Integer day;
    private LocalDate dOb;
    private Integer age;
    private Boolean sex;
    private String nameOfGroup;

    BaseManager manager = new BaseManager();

    public void run () {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel nameP = new JPanel();
        JPanel yearP = new JPanel();
        JPanel dObP = new JPanel();
        JPanel center = new JPanel();
        JPanel sexP = new JPanel();
        JPanel groupSelectionP = new JPanel();

        JLabel firstNameL = new JLabel("Прізвище:");
        JLabel lastNameL = new JLabel("Ім'я:");
        JLabel yearL = new JLabel("Рік:");
        JLabel monthL = new JLabel("місяць:");
        JLabel dayL = new JLabel("день народження:");
        JLabel groupSelectL = new JLabel("Оберіть групу:");

        firstNameT = new JTextField(10);
        lastNameT = new JTextField(10);
        yearT = new JTextField(4);
        monthT = new JTextField(2);
        dayT = new JTextField(2);
        sexM = new JRadioButton("Ч");
        sexF = new JRadioButton("Ж");
        groupSelectionT = new JTextField(20);

        registerB = new JButton("Додати учня");

        lastNameT.setEnabled(false);
        yearT.setEnabled(false);
        monthT.setEnabled(false);
        dayT.setEnabled(false);
        sexM.setEnabled(false);
        sexF.setEnabled(false);
        groupSelectionT.setEnabled(false);
        registerB.setEnabled(false);

        ButtonGroup sexG = new ButtonGroup();

        firstNameT.addActionListener(new FirstNameListener());
        lastNameT.addActionListener(new LastNameListener());
        yearT.addActionListener(new YearListener());
        monthT.addActionListener(new MonthListener());
        dayT.addActionListener(new DayListener());
        sexM.addActionListener(new MeilListener());
        sexF.addActionListener(new FemailListener());
        groupSelectionT.addActionListener(new GroupNameListener());

        registerB.addActionListener(new RegistrationListener());

        nameP.add(firstNameL);
        nameP.add(firstNameT);
        nameP.add(lastNameL);
        nameP.add(lastNameT);
        yearP.add(yearL);
        yearP.add(yearT);
        dObP.add(yearP);
        dObP.add(monthL);
        dObP.add(monthT);
        dObP.add(dayL);
        dObP.add(dayT);

        sexG.add(sexM);
        sexG.add(sexF);
        sexP.add(sexM);
        sexP.add(sexF);

        groupSelectionP.add(groupSelectL);
        groupSelectionP.add(groupSelectionT);
        groupSelectionP.add(registerB);

        center.add(nameP);
        center.add(dObP);
        center.add(sexP);


     frame.getContentPane().add(BorderLayout.CENTER, center);
     frame.getContentPane().add(BorderLayout.SOUTH, groupSelectionP);

     frame.setResizable(false);
     frame.setSize(500, 200);
     frame.setVisible(true);
    }

    class FirstNameListener implements ActionListener {
        public void actionPerformed (ActionEvent firstNameEV) {
            firstName = firstNameT.getText();
            lastNameT.setEnabled(true);
            lastNameT.requestFocus();
            firstNameT.setEnabled(false);
        }
    }

    class LastNameListener implements ActionListener {
        public void actionPerformed (ActionEvent lastNameEV) {
            lastName = lastNameT.getText();
            yearT.setEnabled(true);
            yearT.requestFocus();
            lastNameT.setEnabled(false);
        }
    }

    class YearListener implements ActionListener {
        public void actionPerformed (ActionEvent yearEV) {
            year = Integer.parseInt(yearT.getText());
            monthT.setEnabled(true);
            monthT.requestFocus();
            yearT.setEnabled(false);
        }
    }
    class MonthListener implements ActionListener {
        public void actionPerformed (ActionEvent monthEv){
            month = Integer.parseInt(monthT.getText());
            dayT.setEnabled(true);
            dayT.requestFocus();
            monthT.setEnabled(false);
        }
    }
    class DayListener implements ActionListener {
        public void actionPerformed (ActionEvent dayEv){
            day = Integer.parseInt(dayT.getText());
            dOb = LocalDate.of(year, month, day);
            age = DatesPeriodsCounter.ageCount(dOb);
            sexM.setEnabled(true);
            sexF.setEnabled(true);
            sexM.requestFocus();
            dayT.setEnabled(false);
        }
    }
    class MeilListener implements ActionListener {
        public void actionPerformed (ActionEvent meilev) {
            sex = false;
            groupSelectionT.setEnabled(true);
            groupSelectionT.requestFocus();
            sexM.setEnabled(false);
        }
    }
    class FemailListener implements ActionListener {
        public void actionPerformed (ActionEvent femlev) {
            sex = true;
            groupSelectionT.setEnabled(true);
            groupSelectionT.requestFocus();
            sexF.setEnabled(false);
        }
    }
    class GroupNameListener implements ActionListener {
        public void actionPerformed(ActionEvent groupNameEv) {
            nameOfGroup = groupSelectionT.getText();
            registerB.setEnabled(true);
            registerB.requestFocus();
            groupSelectionT.setEnabled(false);
        }
    }
    class RegistrationListener implements ActionListener {
        public void actionPerformed (ActionEvent regEv){
            Student student = new Student(firstName, lastName, sex, dOb, age);
            GroupOfStudents group = manager.getGroupOfStudents(nameOfGroup);
            group.addStudent(student);
            manager.changeGroup(group);
            firstNameT.setText("");
            lastNameT.setText("");
            yearT.setText("");
            monthT.setText("");
            dayT.setText("");
            sexM.setSelected(false);
            sexF.setSelected(true);
            groupSelectionT.setText("");
            firstNameT.setEnabled(true);
            firstNameT.requestFocus();

        }
    }

}
