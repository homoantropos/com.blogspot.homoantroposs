package com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups;

import com.blogspot.homoantroposs.GymConsumersManager.Groups.GroupOfStudents;

import java.io.*;
import java.util.ArrayList;

public class BaseOfGroups implements Serializable {

    private static ArrayList<GroupOfStudents> baseOfGroups;

    private BaseOfGroups (ArrayList<GroupOfStudents> base) {
        this.baseOfGroups = base;
    }

    protected BaseOfGroups () { }

    public static ArrayList<GroupOfStudents> getBaseOfGroups() {
        return baseOfGroups;
    }

    static {
        try {
            FileInputStream fis = new FileInputStream("baseOfGroups.ser");
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object obj = ois.readObject();
            ArrayList<GroupOfStudents> baseOfGroups = (ArrayList<GroupOfStudents>) obj;
            BaseOfGroups base = new BaseOfGroups (baseOfGroups);
        }catch (IOException ioEx){
            try {
                ArrayList<GroupOfStudents> baseOfGroups = new ArrayList<>();
                BaseOfGroups base = new BaseOfGroups(baseOfGroups);
                FileOutputStream fos = new FileOutputStream("baseOfGroups.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(baseOfGroups);
            }catch (IOException ioEx2){
                System.out.println("Файл не створено");
            }
        } catch (ClassNotFoundException cnfEx) {
            System.out.println("такого класу не існує");
        }
    }
}
