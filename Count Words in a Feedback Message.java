import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feedback message:");
        String feedback = sc.nextLine().trim();

        if (feedback.isEmpty()) {
            System.out.println("No words found.");
        } else {
            String[] words = feedback.split("\\s+"); // Split by one or more spaces
            System.out.println("Word count: " + words.length);
        }
    }
}
