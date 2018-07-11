package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;

public class AttendanceMonitor {
    private AttendanceMonitor () {}

    public static String showStudentAttendanceAll(Student student) {
        StringBuilder dates = new StringBuilder();
        dates.append(String.format("| %17s, %tY, %7s\n", student.toString(), student.getAttendance().get(0).getDateOfDrill(), DatesMonitor.showMonthName(student.getAttendance().get(0).getDateOfDrill())));
        dates.append(String.format("| %17s ", "Дати:"));
        for (Attendance att : student.getAttendance()) {
            dates.append(String.format("| %1$td.%1$tm ", att.getDateOfDrill()));
        }
        dates.append(String.format("\n| %17s ", "Відвідуваність:"));
        for (Attendance att : student.getAttendance()) {
            dates.append(String.format("|   %1s   ", att.getAttendanceCheck().getAttendCheck()));
        }

        return dates.toString();

    }

//    public static String showAttendanceOfStudentDated (Student student, ) {
//
//    }
}
