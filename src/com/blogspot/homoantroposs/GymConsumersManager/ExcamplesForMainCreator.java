package com.blogspot.homoantroposs.GymConsumersManager;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.AttendanceCheck;
import com.blogspot.homoantroposs.GymConsumersManager.Enums.Genders;
import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.AttendanceOfGroupMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Monitors.AttendanceOfStudentMonitor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Admin;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Student;
import com.blogspot.homoantroposs.GymConsumersManager.Users.Tutor;
import com.blogspot.homoantroposs.GymConsumersManager.Users.User;

import java.time.LocalDate;

public class ExcamplesForMainCreator {

    private ExcamplesForMainCreator () {}

    public static void createTHeBase () {

        Tutor antropov = new Tutor("Антропов", "Сергій", LocalDate.of(1971, 06, 8), Genders.MAIL, "+36 050 6577 67 41");
        antropov.creatTheGroup("Новачки", "м. Київ, вул. Древлянська, б. 8");
        Student student = new Student ("Антропов", "Назар", LocalDate.of(2006, 12, 26), Genders.MAIL, "+36 095 520 57 77");
        Student kostiuk = new Student ("Костюк", "Андрій", LocalDate.of(1996, 6, 15), Genders.MAIL, "відсутній");
        Student galych = new Student ("Галич", "Олег", LocalDate.of(1996, 8, 06), Genders.MAIL, "відсутній");
        Student barylo = new Student ("Барило", "Сергій", LocalDate.of(1998, 10, 21), Genders.MAIL, "відсутній");
        Student ivanochko = new Student ("Іваночко", "Валентин", LocalDate.of(1997, 02, 22), Genders.MAIL, "відсутній");
        Student banadyga = new Student ("Банадига", "Юрй", LocalDate.of(2008, 07, 18), Genders.MAIL, "відсутній");
        Student lavriv = new Student ("Лаврів", "Тарас", LocalDate.of(1989, 07, 6), Genders.MAIL, "відсутній");
        Student skrypnyk = new Student ("Скрипник", "Олег", LocalDate.of(1995, 12, 28), Genders.MAIL, "відсутній");
        Student fedenchuk = new Student ("Феденчук", "Станіслав", LocalDate.of(1996, 03, 14), Genders.MAIL, "відсутній");
        Student gorbatiuk = new Student ("Горбатюк", "Михайло", LocalDate.of(2002, 07, 25), Genders.MAIL, "відсутній");
        Student ulishak = new Student ("Улішак", "Назар", LocalDate.of(2006, 11, 17), Genders.MAIL, "відсутній");

        antropov.creatTheGroup("Новачки", "м. Тернопіль, вул. Б. Лепкого, б. 25");

        Tutor dolishnii = new Tutor ("Долішній", "Олександр", LocalDate.of(1986, 02, 12), Genders.MAIL, "відсутній");
        Admin admin = new Admin(antropov);

        admin.removeTutor(BaseOfGroups.getBaseOfGroups().get(1), antropov);
        admin.addTutor(BaseOfGroups.getBaseOfGroups().get(1), dolishnii);

        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), kostiuk);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), galych);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), barylo);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), ivanochko);
        dolishnii.addStudent(BaseOfGroups.getBaseOfGroups().get(1), banadyga);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), lavriv);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), skrypnyk);
        antropov.addStudent(BaseOfGroups.getBaseOfGroups().get(0), fedenchuk);
        dolishnii.addStudent(BaseOfGroups.getBaseOfGroups().get(1), gorbatiuk);
        dolishnii.addStudent(BaseOfGroups.getBaseOfGroups().get(1), ulishak);

        GroupOfStudents наставники = antropov.creatTheGroup("Наставники", "Київська обл. смт Коцюбинське, вул. Миру, б. 3");
        Tutor rosokhatyi = new Tutor ("Росохатий", "Михайло", LocalDate.of(1987, 03, 16), Genders.MAIL, "+38 050 440 5112");
        Tutor netiaga = new Tutor ("Нетяга", "Віталій", LocalDate.of(1989, 01, 25), Genders.MAIL, "+38 067 376 1667");
        Tutor sova = new Tutor ("Сова", "Марія", LocalDate.of(1984, 07, 17), Genders.FEMAIL, "+38 050 574 6398");
        Tutor кільбуртК = new Tutor ("Кільбурт", "Катерина", LocalDate.of(1985, 8, 05), Genders.FEMAIL, "+38 050 544 33 17");
        Tutor кільбуртС = new Tutor ("Кільбурт", "Сергій", LocalDate.of(1981, 04, 18), Genders.MAIL, "+38 050 33 167 33");
        Tutor зінько = new Tutor ("Зінько", "Олена", LocalDate.of(1988, 02, 22), Genders.FEMAIL, "+38 066 1766703");
        Tutor старовойтО = new Tutor ("Старовойт", "Оксана", LocalDate.of(1980, 11, 23), Genders.FEMAIL, "+38 050 543 11 03");
        Tutor сажина = new Tutor ("Сажина", "Ірина", LocalDate.of(1969, 11, 20), Genders.FEMAIL, "не памятаю");
        antropov.addStudent(наставники, rosokhatyi);
        antropov.addStudent(наставники, netiaga);
        antropov.addStudent(наставники, sova);
        antropov.addStudent(наставники, кільбуртК);
        antropov.addStudent(наставники, кільбуртС);
        antropov.addStudent(наставники, зінько);
        antropov.addStudent(наставники, старовойтО);
        antropov.addStudent(наставники, сажина);
    }

    public static void checkAttendanceForAllGroup() {
        Tutor antropov = BaseOfGroups.getBaseOfGroups().get(0).getTutors().get(0);
        Tutor dolishnii = BaseOfGroups.getBaseOfGroups().get(1).getTutors().get(0);
        GroupOfStudents groupOfStudents = BaseOfGroups.getBaseOfGroups().get(0);

        Student student = (Student) groupOfStudents.getStudents().get(0);
        Student student1 = (Student) groupOfStudents.getStudents().get(1);

        for (User s : groupOfStudents.getStudents())
            antropov.checkAttendance(groupOfStudents, (Student) s, AttendanceCheck.ABSENT);

        groupOfStudents = BaseOfGroups.getBaseOfGroups().get(1);
        for (User s : groupOfStudents.getStudents())
            dolishnii.checkAttendance(groupOfStudents, (Student) s, AttendanceCheck.PRESENT);
        dolishnii.checkAttendance(groupOfStudents, student1, AttendanceCheck.ABSENT);

        groupOfStudents = BaseOfGroups.getBaseOfGroups().get(2);
        for (User s : groupOfStudents.getStudents())
            antropov.checkAttendance(groupOfStudents, (Student) s, AttendanceCheck.PRESENT);
//        dolishnii.checkAttendance(groupOfStudents, student1, AttendanceCheck.ABSENT);


        for (GroupOfStudents g : BaseOfGroups.getBaseOfGroups())
        System.out.println(AttendanceOfGroupMonitor.showGroupAttendanceMonthly(g, 7));
        System.out.println("");
        System.out.println(AttendanceOfStudentMonitor.showStudentAttendanceAll(student));
        System.out.println("");
        System.out.println(AttendanceOfStudentMonitor.showAttendanceOfStudentYearly(student, 2017));


    }



}
