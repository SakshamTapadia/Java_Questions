import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of roll numbers: ");
        int n = sc.nextInt();

        int[] rolls = new int[n];
        System.out.println("Enter roll numbers:");
        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int roll : rolls) {
            if (!seen.add(roll)) {
                duplicates.add(roll);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate roll numbers found.");
        } else {
            System.out.println("Duplicate roll numbers: " + duplicates);
        }
    }
}
