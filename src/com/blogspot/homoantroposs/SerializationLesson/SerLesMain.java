package com.blogspot.homoantroposs.SerializationLesson;

import com.blogspot.homoantroposs.SerializationLesson.Base.BaseManager;
import com.blogspot.homoantroposs.SerializationLesson.Base.BaseOfGroups;
import com.blogspot.homoantroposs.SerializationLesson.Facilities.Serializator;
import com.blogspot.homoantroposs.SerializationLesson.Group.GroupOfPersons;
import com.blogspot.homoantroposs.SerializationLesson.Group.GroupsManager;
import com.blogspot.homoantroposs.SerializationLesson.Person.Person;
import com.blogspot.homoantroposs.SerializationLesson.Person.PersonsManager;
import com.blogspot.homoantroposs.Utilites.ScannerHelper;

import java.io.*;
import java.util.ArrayList;

public class SerLesMain extends BaseOfGroups {

    public static void main(String[] args) {

        System.out.println("Створити групу?");
        GroupOfPersons group = new GroupOfPersons ("Новачки");
        String choice = ScannerHelper.askStr();
        while (choice.equals("+")) {
            Person person = PersonsManager.creatPerson();
            System.out.println(person.toString());
            GroupsManager.addPerson(group, person);
            System.out.println("Продовжити?");
            choice = ScannerHelper.askStr();
        }

//        baseOfGroups.getBase().add(group);
        try {
            FileOutputStream fos = new FileOutputStream("basa.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(BaseOfGroups.getBase());
            oos.close();
        }catch (Exception ex) {}
//
//        System.out.println("Створити групу?");
//        GroupOfPersons group1 = new GroupOfPersons ("Новачки2");
//        String choice1 = ScannerHelper.askStr();
//        while (choice1.equals("+")) {
//            Person person = PersonsManager.creatPerson();
//            System.out.println(person.toString());
//            GroupsManager.addPerson(group, person);
//            Serializator.serializationOfGroup(group);
//            System.out.println("Продовжити?");
//            choice1 = ScannerHelper.askStr();
//        }
//
//        BaseManager.addGroup(baseOfGroups, group1);
//        try {
//            FileOutputStream fos = new FileOutputStream("basa.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(baseOfGroups.getBase());
//            oos.close();
//        }catch (Exception ex) {}
//        try {
//            FileInputStream fis = new FileInputStream("basa.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Object obj = ois.readObject();
//            baseOfGroups = new BaseOfGroups ((ArrayList<GroupOfPersons>) obj);
//            ois.close();
//        }catch (Exception ex) {baseOfGroups = new BaseOfGroups();}

        Integer size =BaseOfGroups.getBase().size();

        GroupOfPersons gr = BaseOfGroups.getBase().get(0);

        for (Person pn : gr.getGroup())
            System.out.println(pn.toString());

    }
}
