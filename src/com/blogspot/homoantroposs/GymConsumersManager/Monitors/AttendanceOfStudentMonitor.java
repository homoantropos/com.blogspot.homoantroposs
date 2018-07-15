package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Months;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;

public class AttendanceOfStudentMonitor {

    private AttendanceOfStudentMonitor() {}

    public static String showStudentAttendanceAll(Student student) {
        StringBuilder attendances = new StringBuilder();
        attendances.append(String.format("| %17s\n", student.toString()));
        for (Attendance att : student.getAttendance()) {
            Integer year = att.getDateOfDrill().getYear();
            attendances.append(AttendanceOfStudentMonitor.showAttendanceOfStudentYearly(student, year));
        }
            return attendances.toString();
    }

    public static String showAttendanceOfStudentYearly(Student student, Integer year) {
        StringBuilder attendances = new StringBuilder();
        for (Attendance att : student.getAttendance()) {
            if (att.getDateOfDrill().getYear() == year) {
                for (int i = 1; i <13; i++) {
                    attendances.append(AttendanceOfStudentMonitor.showAttendanceOfStudentMonthlyRow(student, i) + '\n');
                }
            }
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

    public static String showAttendanceOfStudentMonthlyRow (Student student, Integer numberOfMonth) {
        StringBuilder attendances = new StringBuilder();
        String nameOfMonth = DatesMonitor.showNameOfMonth(numberOfMonth);
        if (!student.getAttendance().isEmpty()) {
            attendances.append(String.format("| %15s, ", nameOfMonth));
            Integer count = 0;

            for (Attendance att : student.getAttendance()) {
                attendances.append(att.getDateOfDrill().getYear());
                if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                    count++;
                }
            }

            for (Attendance att : student.getAttendance()) {
                if (att.getDateOfDrill().getMonthValue() == numberOfMonth) {
                    attendances.append(String.format("| %1$td.%1$tm ", att.getDateOfDrill()));
                }
            }
            attendances.append(String.format("\n| %20s ", student.toString()));

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
