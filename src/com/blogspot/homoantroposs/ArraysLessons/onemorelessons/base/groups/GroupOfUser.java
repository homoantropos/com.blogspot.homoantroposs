package arrLessons.groups;

import arrLessons.users.User;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupOfUser implements Serializable {

    private String groupName;
    private ArrayList<User> users;

    public GroupOfUser (String groupName) {
        this.groupName = groupName;
        users = new ArrayList<>();

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
