import java.util.Scanner;

public class PalindromeUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        if (isPalindrome(username)) {
            System.out.println("Valid username (Palindrome)");
        } else {
            System.out.println("Invalid username (Not a Palindrome)");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
