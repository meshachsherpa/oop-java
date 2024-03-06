import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = sc.nextLine(); // here next only takes one word but nextline takes all the words after space.
        System.out.println("Your name is: "+name);
        sc.close(); // closing scanner
    }
}
