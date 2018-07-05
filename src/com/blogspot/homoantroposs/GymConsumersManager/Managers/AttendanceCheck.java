package com.blogspot.homoantroposs.GymConsumersManager.Managers;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public interface AttendanceCheck {

    public static void checkAttendance (Student student, Attendance attendance) {
        student.setAttendance(attendance);
    }
}
