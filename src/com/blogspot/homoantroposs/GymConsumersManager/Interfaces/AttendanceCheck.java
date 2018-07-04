package com.blogspot.homoantroposs.GymConsumersManager.Interfaces;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.Attendance;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;

public interface AttendanceCheck {

    public void checkAttendance (Student student, Attendance attendance);
}
