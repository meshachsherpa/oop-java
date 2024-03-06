import java.sql.SQLOutput;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String result = number > 0 ? "Positive" : number<0 ? "Negative": "Neither positive nor negative";
        System.out.println(result);

        /* if (number % 2 == 0)
        { System.out.println(number + "is even.");
         }else
         {System.out.println(number + "is odd.");
         } */

        // Ternary operator or conditional operator
        // result = condition ? true_expression : false_expression

        //System.out.println(number + " is " + (number%2 == 0 ? "even" : "odd"));
    }
}
