package com.blogspot.homoantroposs.GymConsumersManager.Monitors;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.StudentsParam.Attendance;

public class AttendanceOfGroupMonitor {

    private AttendanceOfGroupMonitor () {}


    public static String showGroupAttendanceYearly (GroupOfStudents group, Integer year) {
      StringBuilder attendances = new StringBuilder();
      Integer studNumberInList = 1;
      for (Student s : group.getStudents()) {
          for (Attendance att : s.getAttendance()) {
              if (att.getDateOfDrill().getYear() == year) {
                  for (Integer month = 1; month <13; month++) {
                      attendances.append(String.format("|   %1s   ", att.getAttendanceCheck().getAttendCheck()));
                  }
              }
          }
      }
      return attendances.toString();
    }
    public static String showGroupAttendanceMonthly (GroupOfStudents group, Integer numberOfMonth) {
        StringBuilder attendances = new StringBuilder();
        String nameOfMonth = DatesMonitor.showNameOfMonth(numberOfMonth);
        attendances.append(String.format("| %37s", (group.getNameOfGroup() + group.getGymAddress())));
        for (Student s : group.getStudents()) {
                attendances.append('\n');
                attendances.append(AttendanceOfStudentMonitor.showAttendanceOfStudentMonthlyRow(s, numberOfMonth));
            }
        return attendances.toString();
    }
}
