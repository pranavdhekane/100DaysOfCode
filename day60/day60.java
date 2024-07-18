package day60;
public class day60 {
    // KADANE'S ALGORITHM
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Add the current element to the running sum
            System.out.println("ite : " + i + " sum : " + sum);
            if (max <= sum) max = sum; // Update max if the current sum is greater
            System.out.println(max);
            if (sum < 0) sum = 0; // Reset sum if it becomes negative
            System.out.println("ite : " + i + " sum : " + sum);
            System.out.println();
        }
        return max; // Return the maximum subarray sum found
    }
    public static void main(String[] args) {
           int nums[ ] = {-2,1,-3,4,-1,2,1,-5,4};
           System.out.println(maxSubArray(nums)); 
        
    }
}
