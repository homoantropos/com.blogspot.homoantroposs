package com.blogspot.homoantroposs.GymConsumersManager.Facilities;

import com.blogspot.homoantroposs.GymConsumersManager.BaseOfGroups.BaseOfGroups;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Memoryzator {

    private Memoryzator () {}

    public static void passBaseOfGroupToMemory () {
        try {
            FileOutputStream fis = new FileOutputStream ("baseOfGroups.ser");
            ObjectOutputStream oos = new ObjectOutputStream (fis);
            oos.writeObject(BaseOfGroups.getBaseOfGroups());
            oos.close();
        } catch (IOException ioex){
            System.out.println("ви не зберегли файл");
        }
    }
}
