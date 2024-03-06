import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in); // scanner is used to take input from user.
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber+secondNumber);

        //System.out.println(firstNumber);
    }
}
