import java.util.Scanner;

public class RestaurantBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ₹");
        double bill = sc.nextDouble();
        double finalAmount;

        if (bill > 1000) {
            double discount = bill * 0.10;
            finalAmount = bill - discount;
            System.out.println("10% discount applied: ₹" + discount);
        } else {
            finalAmount = bill;
            System.out.println("No discount applied.");
        }

        System.out.println("Final amount to pay: ₹" + finalAmount);
    }
}
