import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUser = sc.nextLine();
        System.out.print("Enter password: ");
        String inputPass = sc.nextLine();

        if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
