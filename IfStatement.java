import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        double accountBalance = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        short amountToWithdraw = sc.nextShort();
        if(amountToWithdraw <= accountBalance) { // 1000<=500 = false
            System.out.println("Please collect money. ");

        } else {
            System.out.println("Insufficient balance. ");
        }
        System.out.println("Bye");
    }
}

