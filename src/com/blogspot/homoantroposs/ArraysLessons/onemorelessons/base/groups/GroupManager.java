package arrLessons.groups;

import arrLessons.users.User;
import arrLessons.utilites.ScannerHelper;

public class GroupManager {

    GroupManager () {}

    public static GroupOfUser createTheGroup () {
        System.out.println("Назва групи:");
        String nameOfGroup = ScannerHelper.inputStr();
        GroupOfUser group = new GroupOfUser(nameOfGroup);
        return group;
    }

    public static GroupOfUser setUserInGroup (User user, GroupOfUser group) {
        group.getUsers().add(user);
        return group;
    }

}
