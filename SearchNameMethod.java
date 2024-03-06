import java.util.Scanner;

public class SearchNameMethod {
    public static void main(String[] args) {
        String names [] = {"Meshach", "Luke", "Mathew", "Paul", "John", "Jacob", "Joshua"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        findStudentName(names, name);



    }
    public static void findStudentName(String[] names, String nameToSearch){
        boolean isFound = false;
    for (String name: names){
        if (name.equalsIgnoreCase(nameToSearch)){
            isFound = true;
            break;
        }
    }
    if (isFound){
        System.out.println(nameToSearch + " found");
    }else{
        System.out.println(nameToSearch + " not found" );

    }

    }
}
