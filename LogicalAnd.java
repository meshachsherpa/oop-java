import java.util.Scanner;

public class LogicalAnd {
    public static void main(String[] args) {
        // 1. age >= 18 years
        // 2. Must be in Nepal.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = sc.nextByte();
        System.out.println("Are you in Nepal (Y/N): ");
        char isNepal = sc.next().toUpperCase().charAt(0);
        if(age >= 18 && isNepal == 'Y') {
            System.out.println("You are eligible ot vote. ");
        }else {
            System.out.println("You are not eligible to vote. ");
        }

    }
}
