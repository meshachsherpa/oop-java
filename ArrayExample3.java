public class ArrayExample3 {
    public static void main(String[] args) {
        // Finding maximum value from the set of values
        int nums[] = {34, 1, 45, 23, 987, 56, 43};

        int max = nums[0];
        for (var i=1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("Maximun value is: "+max);
    }
}
