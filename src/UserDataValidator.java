import java.util.ArrayList;

public class UserDataValidator {

    // ---------- Attributes ----------
    private User user;
    private final String errorMessage = "Error: Following user not created: ";


    // ---------- Methods ----------
    public void addUserToList(User user, ArrayList<User> users){
        if (user != null){
            users.add(user);
        }
    }


    // createUser methods
    public User createUser(String name, String password){

        if (validateName(name) && validatePassword(password)){
            user = new User(name, password);
            return user;
        }

        System.err.println(errorMessage + name);
        return null;
    }


    public User createUser(String name, String password, String email){

        if (validateName(name) && validatePassword(password) && validateEmail(email)){
            user = new User(name, password, email);
            return user;
        }

        System.err.println(errorMessage + name);
        return null;
    }


    public User createUser(String name, String password, String email, String phoneNumber){

        if (validateName(name) && validatePassword(password) && validateEmail(email) && validatePhoneNumber(phoneNumber)){
            user = new User(name, password, email, phoneNumber);
            return user;
        }

        System.err.println(errorMessage + name);
        return null;
    }


    // Validation methods
    private boolean validateName(String name){
        if (name.trim().length() <= 2){
            return false;
        }

        if (!name.matches("^[A-Z].*")){
            return false;
        }
        return true;
    }


    private boolean validatePassword(String password){
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            return false;
        }

        if(!password.matches(".*[\\p{Punct}].*")){
            return false;
        }
        return true;
    }


    private boolean validateEmail(String email){
        if (!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")) {
            return false;
        }
        return true;
    }


    private boolean validatePhoneNumber(String phoneNumber){
        if (!phoneNumber.matches("\\d{8}")){
            return false;
        }
        return true;
    }
}
