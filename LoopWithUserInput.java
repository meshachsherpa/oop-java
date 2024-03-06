import java.util.Scanner;

public class LoopWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of times you want to print it: ");
        int count = sc.nextInt();

        for(int i=1; i<=count; i++)
        {
            System.out.println("Meshach");
        }

    }
}
