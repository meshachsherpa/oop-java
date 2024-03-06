public class MethodInto2 {
    public static void main(String[] args) {
        int nums [] = {34, 1002, 45, 23, 987, 56, 43};
        int nums2 [] = {8934, 1002, 453, 243, 987, 546, 403};
        int nums3 [] = {34, 1002, 4453, 2433, 487, 546, 2403};

        // Call/Invoke method
        findMaximumValueOfArray(nums);
        findMaximumValueOfArray(nums2);
        findMaximumValueOfArray(nums3);
    }






    // Method to find maximum value of an array.
    public static void findMaximumValueOfArray(int [] nums){ //Method signature.
        // Method body/implementation - actual logic to find maximum value of an array.

        int max = nums[0];
        for (var i=1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];

            }

        }
        System.out.println("Maximun value of array is: "+max);

    }
}


