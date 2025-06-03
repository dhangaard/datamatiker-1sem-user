import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        UserDataValidator userDataValidator = new UserDataValidator();


        // To generate user:
        // Name: Initial character must be uppercase, first name only, minimum length of 2 characters
        // Password: Must consist of at least 8 characters with a min. of one uppercase, one lowercase and one integer
        // Email: Must follow format "example@domain.com" with valid characters (lowercase, integers and special characters) and domain
        // Phone number: Must be a String where only integers are accepted, must have a length of precisely 8 characters, no spacing

        // Instantiate users
        User userC = userDataValidator.createUser("Christian", "navnetPaaMinHund-2016", "test@yahoo.com", "60201080");
        User userB = userDataValidator.createUser("Birgitte", "kodeOrd-2860", "test@live.com");
        User userA = userDataValidator.createUser("Anders", "Abcd-1234");
        User userT = userDataValidator.createUser("test_Do_Not_Add", "NoInteger", "email@wrongFormat.com", "1234567");

        // Add users to list
        userDataValidator.addUserToList(userC, users);
        userDataValidator.addUserToList(userB, users);
        userDataValidator.addUserToList(userA, users);
        userDataValidator.addUserToList(userT, users);

        // Sort list
        Collections.sort(users);

        System.out.println(); // Empty line

        // Display users
        for (User u : users) {
            System.out.println(u);
            System.out.println(); // Empty line
        }
    }
}
