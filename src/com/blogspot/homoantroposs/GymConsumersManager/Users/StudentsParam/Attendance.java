package com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendance implements Serializable {

    private AttendanceCheck attendanceCheck;
    private LocalDate dateOfDrill;
    private String nameOfGroup;
    private String nameOfTutor;
    private String gym;

    public Attendance (AttendanceCheck attendanceCheck, String nameOfGroup, String nameOfTutor, String gym) {
        this.attendanceCheck = attendanceCheck;
        dateOfDrill = LocalDate.now();
        this.nameOfGroup = nameOfGroup;
        this.nameOfTutor = nameOfTutor;
        this.gym = gym;
    }

    public AttendanceCheck getAttendanceCheck() { return attendanceCheck; }

    public LocalDate getDateOfDrill() { return dateOfDrill; }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public String getNameOfTutor() {
        return nameOfTutor;
    }

    public String getGym() {
        return gym;
    }

}
