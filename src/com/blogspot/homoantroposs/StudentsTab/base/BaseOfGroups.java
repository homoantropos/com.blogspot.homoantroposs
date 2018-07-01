package com.blogspot.homoantroposs.StudentsTab.base;

import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.*;
import java.util.ArrayList;

public class BaseOfGroups implements Serializable {

    private static ArrayList <GroupOfStudents> baseOfGroups;

    private BaseOfGroups (ArrayList<GroupOfStudents> baseOfGroups) {
        this.baseOfGroups = baseOfGroups;
    }

    protected BaseOfGroups () {}

    public static ArrayList<GroupOfStudents> getBase () {
        return baseOfGroups;
    }

    static {
        try {
            FileInputStream fis = new FileInputStream("base.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            ArrayList<GroupOfStudents> base = (ArrayList<GroupOfStudents>) object;
            BaseOfGroups baseOfGroups = new BaseOfGroups(base);
            ois.close();
        }
        catch (Exception e) {
            try {
                FileOutputStream fos = new FileOutputStream("base.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ArrayList<GroupOfStudents> base = new ArrayList<>();
                oos.writeObject(base);
                oos.close();            }
            catch (IOException ex) {
                System.out.println("Файл не знайдено.");
            }
        }

    }

}
