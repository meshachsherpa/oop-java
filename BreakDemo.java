import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int [] numbers = {45, 25, 54, 65, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int numberToSearch = sc.nextInt();
        for(int num: numbers)
        {
            if(num == numberToSearch)
            {
                System.out.println(numberToSearch+" found");
                break; // This one immediately terminates the loop.
            }
        }
    }
}
