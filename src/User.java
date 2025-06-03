public class User implements Comparable<User>{

    // ---------- Attributes ----------
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private String countryCode = "+45 ";


    // ---------- Constructors ----------
    User(String name, String password){
        this.name = name;
        this.password = password;
    }


    User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }


    User(String name, String password, String email, String phoneNumber){
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    // ---------- Methods ----------
    @Override
    public String toString(){
        String message = buildUserDetails();
        return message;
    }

    private String buildUserDetails(){
        String message = "Name: " + this.name + "\nPassword: " + this.password;

            // Add email if not null or empty
            if (this.email != null){
                message += "\nE-mail: " + this.email;
            }

            // Add phone number if not null or empty
            if (phoneNumber != null){
                message += "\nPhone number: " + this.countryCode + this.phoneNumber;
            }

            return message;
    }


    @Override
    public int compareTo(User user){
        // Use String method compareTo to return either -1, 0 or 1
        int result = this.name.compareTo(user.getName());
        return result;
    }


    // Accessors
    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    
    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
