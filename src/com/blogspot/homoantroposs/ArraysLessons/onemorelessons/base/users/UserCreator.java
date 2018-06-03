package arrLessons.users;

import arrLessons.utilites.ScannerHelper;

public class UserCreator {

    UserCreator () {}

    public static User createUser () {
        String name = askName ();
        User user = new User (name);
        return user;
    }
    public static String askName() {
        System.out.println("Введіть ім'я:");
        String name = ScannerHelper.inputStr();
        return name;
    }

}
