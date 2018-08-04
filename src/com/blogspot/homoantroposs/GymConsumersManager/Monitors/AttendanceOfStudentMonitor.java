package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Months;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;

import java.util.ArrayList;

public class AttendanceOfStudentMonitor {

    private AttendanceOfStudentMonitor() {}

    public static String showStudentAttendanceAll(Student student) {
        StringBuilder attendances = new StringBuilder();
        attendances.append(String.format("| %17s\n", student.toString()));
        ArrayList<Integer> years = new ArrayList<>();
        for (Attendance att : student.getAttendance()) {
            Integer year = att.getDateOfDrill().getYear();
            if (!years.contains(year)) {
                years.add(year);
                attendances.append(AttendanceOfStudentMonitor.showAttendanceOfStudentYearly(student, year));
            }
            }
            return attendances.toString();
    }

    public static String showAttendanceOfStudentYearly(Student student, Integer year) {
        StringBuilder attendances = new StringBuilder();
        ArrayList<Integer> years = new ArrayList<>();
        for (Attendance att : student.getAttendance()) {
            if (!years.contains(year)) {
                if (att.getDateOfDrill().getYear() == year) {
                    years.add(year);
                    Integer countS = 1;
                    for (int i = 1; i < 13; i++) {
                        attendances.append(AttendanceOfStudentMonitor.showAttendanceOfStudentMonthlyRow(student, i, countS) + '\n');
                    }
                    countS++;
                }
            }
        }
        if (years.isEmpty()) {
            attendances.append(String.format("В %4dму році %-20s не відвідав жодного тренування", year, student.toString()));
        }
        return attendances.toString();
    }

    public static String showAttendanceOfStudentMonthly (Student student, String nameOfMonth) {
        StringBuilder attendances = new StringBuilder();
        Integer numberOfMonth = DatesMonitor.showNumberOfMonth(nameOfMonth);
        attendances.append (AttendanceOfStudentMonitor.showAttendanceOfStudentMonthly(student, numberOfMonth));
        return attendances.toString();

        }

    public static String showAttendanceOfStudentMonthly (Student student, Integer numberOfMonth) {
        StringBuilder attendances = new StringBuilder();
        String nameOfMonth = DatesMonitor.showNameOfMonth (numberOfMonth);
        attendances.append(String.format("| %17s, %7s\n", student.toString(), nameOfMonth));
        attendances.append(String.format("| %17s ", "Дати:"));
        for (Attendance att : student.getAttendance()) {
            if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                attendances.append(String.format("| %1$td.%1$tm ", att.getDateOfDrill()));
            }
        }

        attendances.append(String.format("\n| %17s ", "Відвідуваність:"));

        for (Attendance att : student.getAttendance()) {
            if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                attendances.append(String.format("|   %1s   ", att.getAttendanceCheck().getAttendCheck()));
            }
        }

        return attendances.toString();

    }

    public static String showAttendanceOfStudentMonthlyRow (Student student, Integer numberOfMonth, Integer countS) {
        StringBuilder attendances = new StringBuilder();
        String nameOfMonth = DatesMonitor.showNameOfMonth(numberOfMonth);
        if (!student.getAttendance().isEmpty()) {
            attendances.append(String.format("|      %15s, ", nameOfMonth));
            Integer count = 0;
            int j = 0;

            for (Attendance att : student.getAttendance()) {
                while (j < 1){
                attendances.append(att.getDateOfDrill().getYear());
                j++;
                }
                if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                    count++;
                }
            }

            for (Attendance att : student.getAttendance()) {
                if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                    attendances.append(String.format("| %1$td.%1$tm ", att.getDateOfDrill()));
                }
            }

            attendances.append(String.format("\n|%3d.| %-20s ", countS, student.toString()));

            if (count == 0) {
                attendances.append(String.format("| не відвідував"));
            }

            for (Attendance att : student.getAttendance()) {
                if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                    attendances.append(String.format("|   %1s   ", att.getAttendanceCheck().getAttendCheck()));
                }
            }
        } else {
            attendances.append(String.format("| %20s | не відвідував жодного тренування", student.toString()));
        }
        return attendances.toString();
    }

}
