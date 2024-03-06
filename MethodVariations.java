public class MethodVariations {
    public static void main(String[] args) {
        // int result =  addNumbers(5,10);
        // int result = addNumbers();
        // System.out.println("Sum is: "+result);
        // addNumbers1(10, 25);
        addNumbers2();
    }

    // Does not return and no input parameter
    public static void addNumbers2(){
        int n1 = 100, n2 = 200;
        int sum = n1 + n2;
        System.out.println("Sum is: "+sum);
    }


    // Does not return but takes input parameter.

    public static void addNumbers1(int n1, int n2){
        int result = n1 + n2;
        System.out.println("Sum is "+result);

    }

    // Returns but does not take input parameter

    public static int addNumbers(){
        int num1 = 10, num2 = 15;
        int sum = num1 + num2;
        return sum;

    }

    // Returns and takes input parameter
    public static int addNumbers(int num1, int num2){ //num1=5, num2=10
        int sum = num1+num2;
        return sum;
    }
}
