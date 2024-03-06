import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        double [] numbers = {21, 14, 98, 68, 2.1, 2.3, 5.4, 6.8};
        Arrays.sort(numbers);
        for (double num: numbers){
            System.out.println(num);
        }
        System.out.println(numbers[2]);
        numbers[2] = 100;
        System.out.println(numbers[2]);
    }
}
