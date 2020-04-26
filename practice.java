public class FoodpandaNewUser {
    String surname;
    String othername;
    String email;
    int phoneNo;
    String password;

    public FoodpandaNewUser(String surname, String othername) {
        this.surname = surname;
        this.othername = othername;
    }

    public void UserEmail(String UserEmail) {
        email = UserEmail;
    }

    public void UserPhoneNo(int UserPhoneNo) {
        phoneNo = UserPhoneNo;
    }

    public void UserPassword(String UserPassword) {
        password = UserPassword;
    }
    
    public void printUser() {
        System.out.println("Surname: " + surname);
        System.out.println("Othername: " + othername);
        System.out.println("Email: " + email);
        System.out.println("Phone No.: " + phoneNo);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        FoodpandaNewUser User1 = new FoodpandaNewUser ("Panda", "Mary");
        User1.UserEmail("Pandamary1@gmail.com");
        User1.UserPhoneNo(12345678);
        User1.UserPassword("abcd1234");
        User1.printUser();
    }
}