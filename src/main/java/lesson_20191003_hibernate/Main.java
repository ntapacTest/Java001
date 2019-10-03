package lesson_20191003_hibernate;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
        User user=new User();
        user.setFirstName("User1_FirstName");
        user.setLastName("User1_LastName");
        user.setLocale("User1_Locale");

        userService.save(user);
    }

}
