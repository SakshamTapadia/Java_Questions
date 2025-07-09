import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's salary: ₹");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        if (years >= 10) {
            bonus = salary * 0.10;
        } else if (years >= 5) {
            bonus = salary * 0.05;
        } else {
            bonus = salary * 0.02;
        }

        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total salary after bonus: ₹" + (salary + bonus));
    }
}
