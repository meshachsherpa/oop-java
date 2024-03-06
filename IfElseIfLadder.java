import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        float percentage = sc.nextFloat();

        if (percentage >= 80)
        {
            System.out.println("Distinction division. ");
        }
        else if (percentage>=70)
        {
            System.out.println("First division. ");
        }
        else if (percentage>=60)
        {
            System.out.println("Second division. ");
        }
        else if (percentage >= 50)
        {
            System.out.println("Third division. ");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
