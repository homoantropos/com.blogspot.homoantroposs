package com.blogspot.homoantroposs.GymConsumersManager;


import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Months;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.AttendanceMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.BaseOfGroupsMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.DatesMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;

import java.time.LocalDate;

public class MainGCM extends BaseOfGroups {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1971, 06, 8);
        System.out.println(DatesMonitor.showMonthName(date));

//        Tutor antropov = BaseOfGroups.getBaseOfGroups().get(0).getTutors().get(0);
//        GroupOfStudents groupOfStudents = BaseOfGroups.getBaseOfGroups().get(0);
        Student student = BaseOfGroups.getBaseOfGroups().get(0).getStudents().get(1);
        Student student1 = BaseOfGroups.getBaseOfGroups().get(0).getStudents().get(0);

//        antropov.checkAttendance(groupOfStudents, student, AttendanceCheck.ABSENT);
//        antropov.checkAttendance(groupOfStudents, student1, AttendanceCheck.PRESENT);

        System.out.println(AttendanceMonitor.showStudentAttendanceAll(student));
        System.out.println(AttendanceMonitor.showStudentAttendanceAll(student1));
//
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//
        System.out.println(BaseOfGroupsMonitor.showOnlyNamesAllGroups());
        System.out.println(BaseOfGroupsMonitor.showAllGroups());


//        Tutor antropov = new Tutor("Антропов", "Сергій", LocalDate.of(1971, 06, 8), Genders.MAIL, "+36 050 6577 67 41");
//        antropov.creatTheGroup("Новачки", "м. Київ, вул. Древлянська, б. 8");
//        Student student = new Student ("Антропов", "Назар", LocalDate.of(2006, 12, 26), Genders.MAIL, "+36 095 520 57 77");
//        Student kostiuk = new Student ("Костюк", "Андрій", LocalDate.of(1996, 6, 15), Genders.MAIL, "відсутній");
//        Student galych = new Student ("Галич", "Олег", LocalDate.of(1996, 8, 06), Genders.MAIL, "відсутній");
//        Student barylo = new Student ("Барило", "Сергій", LocalDate.of(1998, 10, 21), Genders.MAIL, "відсутній");
//        Student ivanochko = new Student ("Іваночко", "Валентин", LocalDate.of(1997, 02, 22), Genders.MAIL, "відсутній");
//        Student banadyga = new Student ("Банадига", "Юрй", LocalDate.of(2008, 07, 18), Genders.MAIL, "відсутній");
//        Student lavriv = new Student ("Лаврів", "Тарас", LocalDate.of(1989, 07, 6), Genders.MAIL, "відсутній");
//        Student skrypnyk = new Student ("Скрипник", "Олег", LocalDate.of(1995, 12, 28), Genders.MAIL, "відсутній");
//        Student fedenchuk = new Student ("Феденчук", "Станіслав", LocalDate.of(1996, 03, 14), Genders.MAIL, "відсутній");
//        Student gorbatiuk = new Student ("Горбатюк", "Михайло", LocalDate.of(2002, 07, 25), Genders.MAIL, "відсутній");
//        Student ulishak = new Student ("Улішак", "Назар", LocalDate.of(2006, 11, 17), Genders.MAIL, "відсутній");
//
//        antropov.creatTheGroup("Новачки", "м. Тернопіль, вул. Б. Лепкого, б. 25");
//
//        Tutor dolishnii = new Tutor ("Долішній", "Олександр", LocalDate.of(1986, 02, 12), Genders.MAIL, "відсутній");
//        Admin admin = new Admin(antropov);
//
//        admin.removeTutor(BaseOfGroups.getBaseOfGroups().get(1), antropov);
//        admin.addTutor(BaseOfGroups.getBaseOfGroups().get(1), dolishnii);
//
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), kostiuk);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), galych);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), barylo);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), ivanochko);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(1), banadyga);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), lavriv);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), skrypnyk);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), fedenchuk);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(1), gorbatiuk);
//        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(1), ulishak);

    }
}
