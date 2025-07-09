import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 3;
        } else if (units <= 200) {
            bill = 100 * 3 + (units - 100) * 5;
        } else {
            bill = 100 * 3 + 100 * 5 + (units - 200) * 10;
        }

        System.out.println("Total bill: ₹" + bill);
    }
}
