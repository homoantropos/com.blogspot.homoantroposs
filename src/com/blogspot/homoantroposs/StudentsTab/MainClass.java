package com.blogspot.homoantroposs.StudentsTab;

import com.blogspot.homoantroposs.StudentsTab.mainMenus.MainMenu;
import com.blogspot.homoantroposs.StudentsTab.base.BaseOfGroups;
import com.blogspot.homoantroposs.StudentsTab.groups.GroupOfStudents;

import java.io.*;
import java.util.ArrayList;

public class MainClass extends BaseOfGroups  {

    public static void main(String[] args) {

       MainMenu menu = new MainMenu();
       Thread men = new Thread (menu);
        men.run();

    }
}
