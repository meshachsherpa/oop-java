import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        String names [] = {"Meshach", "Luke", "John", "Mathew", "Paul"};


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you first name: ");
        String firstName = sc.next();

        int index = -1;

       /* int ind = 0;
        for (String name: names){
            if (name.equalsIgnoreCase(firstName)){
                index = ind;
                break;
            }
            ind++;

        } */


        for (var i=0; i<names.length; i++){
            if (names[i].equalsIgnoreCase(firstName)){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println(firstName + " found at index: " + index );
        }else {
            System.out.println(firstName + " not found. ");
        }
    }
}


