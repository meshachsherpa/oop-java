public class MethodCallingMethod {
    public static void main(String[] args) {

        int nums  [] = {34, 1902, 45, 23, 987, 56, 43};
        int nums2 [] = {9900, 1002, 453, 243, 987, 546, 403};
        int nums3 [] = {34, 1002, 4453, 2433, 487, 546, 2403};


        // Call/Invoke method
        int maxValue = findMaximumValueOfArray(nums);
        System.out.println("Maximun value of array is: "+maxValue);
        maxValue = findMaximumValueOfArray(nums2);
        System.out.println("Maximun value of array is: "+maxValue);
        maxValue = findMaximumValueOfArray(nums3);
        System.out.println("Maximun value of array is: "+maxValue);
    }






    // Method to find maximum value of an array.
    public static int  findMaximumValueOfArray(int [] nums){ //Method signature.
        // Method body/implementation - actual logic to find maximum value of an array.

        int max = nums[0];
        for (var i=1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];

            }

        }
       return max;

    }

}
