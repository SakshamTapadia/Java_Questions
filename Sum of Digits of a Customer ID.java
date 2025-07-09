import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer ID (positive integer): ");
        int id = sc.nextInt();

        int sum = 0;
        int original = id;

        while (id > 0) {
            sum += id % 10;
            id /= 10;
        }

        System.out.println("Sum of digits of customer ID " + original + " is: " + sum);
    }
}
