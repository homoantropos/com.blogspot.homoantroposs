package com.blogspot.homoantroposs.StudentsTab;

import com.blogspot.homoantroposs.StudentsTab.mainMenus.MainMenu;
import com.blogspot.homoantroposs.StudentsTab.base.BaseOfGroups;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.*;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<GroupOfStudents> base = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("base.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            base = (ArrayList<GroupOfStudents>) object;
            BaseOfGroups.setBase(base);
        }
        catch (Exception e) {
            try {
                FileOutputStream fos = new FileOutputStream("base.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(base);
            }
            catch (IOException ex) {
                System.out.println("Файл не знайдено.");
            }
        }

       MainMenu menu = new MainMenu();
       Thread men = new Thread (menu);
        men.run();

    }
}
