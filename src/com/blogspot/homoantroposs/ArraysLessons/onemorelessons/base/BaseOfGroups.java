package arrLessons.base;

import arrLessons.groups.GroupOfUser;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseOfGroups implements Serializable {

    private static ArrayList<GroupOfUser> base = new ArrayList<>();

    BaseOfGroups(){}

    public static ArrayList<GroupOfUser> getBase() {
        return base;
    }

    public static void setBase(ArrayList<GroupOfUser> base) {
        BaseOfGroups.base = base;
    }
}
