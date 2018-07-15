package com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam;

import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attendance)) return false;
        Attendance that = (Attendance) o;
        return  Objects.equals(getDateOfDrill(), that.getDateOfDrill()) &&
                Objects.equals(getNameOfGroup(), that.getNameOfGroup()) &&
                Objects.equals(getNameOfTutor(), that.getNameOfTutor()) &&
                Objects.equals(getGym(), that.getGym());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAttendanceCheck(), getDateOfDrill(), getNameOfGroup(), getNameOfTutor(), getGym());
    }
}
