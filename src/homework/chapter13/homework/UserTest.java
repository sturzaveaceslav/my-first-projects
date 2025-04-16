package md.enums;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Slavon", UserRole.ADMIN);
        user1.displayPermissions();

        System.out.println("-----");

        User user2 = new User("Ion", UserRole.USER);
        user2.displayPermissions();
    }
}
