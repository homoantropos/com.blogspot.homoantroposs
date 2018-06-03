package com.blogspot.homoantroposs.ArraysLessons.massivs;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class Shedule implements Serializable {

    static ArrayList<Event> events;

    public Shedule(ArrayList<Event> events){
        this.events = events;
    }

    public static ArrayList<Event> getEvents() {
        return events;
    }

    public static void setEvents(ArrayList<Event> events) {
        Shedule.events = events;
    }

    static {
        Shedule shedule;
        try {
            FileInputStream fis = new FileInputStream ("events.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            shedule = (Shedule) obj;
            ArrayList<Event> shed = shedule.getEvents();
            for (Event sh : shed)
            System.out.println(sh.toString());
        }
        catch(Exception ex) {
            try{
                ArrayList<Event> events = new ArrayList<>();
                shedule = new Shedule(events);
                FileOutputStream fos = new FileOutputStream("group.ser");
                ObjectOutputStream oos = new ObjectOutputStream (fos);
                oos.writeObject(shedule);
               } catch (IOException exp) {
                System.out.println("файл не створено");
            }
        }
    }
}
