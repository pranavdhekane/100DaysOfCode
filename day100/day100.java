package day100;

public class day100 {
        public static int min(int nums[]) {
            int i = 0;
            int m = nums[0];
            
            for(int j = 1; j< nums.length; j++){
                if(nums[j] < m){
                    i = j;
                    m = nums[j];
                }
            }
            
            return i;
        }
        public static int[] getFinalState(int[] nums, int k, int multiplier) {
            int midx;
            while( k > 0 ) {
                midx = min(nums);
                nums[midx] *= multiplier;
                k--;
            }
            return nums;
        }
    public static void main(String[] args) {
        int nums[] = {100000,2000};
        nums = getFinalState(nums, 2, 1000000);
        for(int i = 0; i< nums.length; i++)
        System.out.println(nums[i]);

        // int []num = {16, 5, 8};
        // System.out.println(min(nums));
    }
}
