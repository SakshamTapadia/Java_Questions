import java.util.Arrays;
import java.util.Scanner;

public class SortCartPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items in cart: ");
        int n = sc.nextInt();
        double[] prices = new double[n];

        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        Arrays.sort(prices);

        System.out.println("Sorted prices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }
}
