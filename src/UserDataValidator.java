import java.util.ArrayList;

public class UserDataValidator {

    // Attributes
    private User user;
    private final String errorMessage = "Error: Following user not created: ";


    // Methods
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
        if (name.trim().length() <= 2){ // Name consists of at least 2 characters
            return false;
        }

        if (!name.matches("^[A-Z].*")){ // First character in name is upper case
            return false;
        }
        return true;
    }


    private boolean validatePassword(String password){
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        if (password.length() < 8) { // Password at least 6 characters long
            return false;
        }

        if (!password.matches(".*[A-Z].*")) { // Password includes at least one upper case letter
            return false;
        }

        if (!password.matches(".*[a-z].*")) { // Password includes at least one lower case letter
            return false;
        }

        if (!password.matches(".*\\d.*")) { // Password includes at least one digit
            return false;
        }

        if(!password.matches(".*[\\p{Punct}].*")){ // Password includes at least one special character
            return false;
        }
        return true;
    }


    private boolean validateEmail(String email){
        if (!email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")) { // Email follows correct format
            return false;
        }
        return true;
    }


    private boolean validatePhoneNumber(String phoneNumber){
        if (!phoneNumber.matches("\\d{8}")){ // Phone number consists of exactly eight digits
            return false;
        }
        return true;
    }
}
