import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000.00; // Example balance
        System.out.println("Current Balance: ₹" + balance);

        System.out.print("Enter amount to withdraw: ₹");
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of ₹100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + balance);
        }
    }
}
