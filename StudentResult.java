import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store subject names and their corresponding percentages
        String[] subjects = new String[5];
        double[] percentages = new double[5];

        // Input phase
        System.out.println("Enter the names of 5 subjects and their equivalent percentage:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
            System.out.print("Percentage: ");
            percentages[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
        }

        // Calculating average percentage
        double totalPercentage = 0;
        for (double percentage : percentages) {
            totalPercentage += percentage;
        }
        double averagePercentage = totalPercentage / 5;

        // Checking if the student passed or failed
        boolean passed = averagePercentage >= 50;

        // Output phase
        System.out.println("\nResult:");
        System.out.println("Average Percentage: " + averagePercentage);
        if (passed) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Sorry! You failed.");
        }

        scanner.close();
    }

}

