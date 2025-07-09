import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasNumber = password.matches(".*\\d.*");
        boolean isStrong = password.length() >= 8 && hasNumber;

        if (isStrong) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak. Must be at least 8 characters and contain a number.");
        }
    }
}
