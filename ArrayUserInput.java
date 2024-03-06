import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        byte noOfSubjects = sc.nextByte();
        float marks[] = new float[noOfSubjects];
        for (byte i=0; i<noOfSubjects; i++){
            System.out.println("Enter marks of subjects: " +(i+1)+": ");
            marks[i] = sc.nextFloat();
        }
        System.out.println("Your marks: ");
        for (float mark: marks){
            System.out.println(mark);
        }


    }
}
