package com.blogspot.homoantroposs.SerializationLesson.Facilities;

import com.blogspot.homoantroposs.SerializationLesson.Group.GroupOfPersons;
import com.blogspot.homoantroposs.SerializationLesson.Person.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

    private static GroupOfPersons group;

    private Serializator() {
    }

    public static void serializationOfPerson (Person person) {
        String nameOfFile=person.getSurName() + ".ser";
        try {FileOutputStream fos = new FileOutputStream(nameOfFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
        } catch (Exception fnfex){}
    }

    public static void serializationOfGroup (GroupOfPersons group) {
        String nameOfFile=group.getNameOfGroup() + ".ser";
        try {FileOutputStream fos = new FileOutputStream(nameOfFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(group);
            oos.close();
        } catch (Exception fnfex){}
    }

    public static GroupOfPersons readingSerGroup (String nameOfGroup) {
        String nameOfFile = nameOfGroup + ".ser";
        try {
            FileInputStream fis = new FileInputStream(nameOfFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            group = (GroupOfPersons) obj;
            ois.close();
        }catch (Exception ex) {
            group = null;
            System.out.println("Такої групи не існує.");
        }
        return group;
    }
}
