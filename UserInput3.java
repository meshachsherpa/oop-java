import java.util.Scanner;

public class UserInput3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender (M/F)");
        char gender = sc.next().charAt(0); // Female
        System.out.println("Gender is: " +gender);
    }
}
