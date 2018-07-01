package com.blogspot.homoantroposs.SerializationLesson.Base;

import com.blogspot.homoantroposs.SerializationLesson.Group.GroupOfPersons;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BaseOfGroups implements Serializable {

    private static ArrayList <GroupOfPersons> base;

    private BaseOfGroups (ArrayList<GroupOfPersons> base) {
        this.base = base;
    }

    protected BaseOfGroups () {}

    public static ArrayList<GroupOfPersons> getBase() {
        return base;
    }

    static {
        try {
            FileInputStream fis = new FileInputStream("basa.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<GroupOfPersons> basa = (ArrayList<GroupOfPersons>) ois.readObject();
            BaseOfGroups baseOfGroups = new BaseOfGroups(basa);
            ois.close();
            System.out.println("відпрацювало");
        }catch (Exception e) {
            try {
                FileOutputStream fos = new FileOutputStream("basa.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ArrayList<GroupOfPersons> basa = new ArrayList<>();
                BaseOfGroups baseOfGroups = new BaseOfGroups(basa);
                oos.writeObject(basa);
                oos.close();
                System.out.println("щось таке");
            }catch (Exception ex) {}
        }
    }
}
