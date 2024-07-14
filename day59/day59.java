package day59;

// import java.util.ArrayList;

public class day59 {
    public static void main(String[] args) {
        int nums[] = {-1, -2};
        int sum = 0;
        int presum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if (sum > presum) {
                    presum = sum;
                }
            }
        }
        System.out.println(presum);
    }
    // public static void main(String[] args) {
    //     int nums[] = {-1, -2};
    //     int sum = 0;
    //     int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             sum = 0; // Reset sum for each new subarray
    //             for (int k = i; k <= j; k++) {
    //                 sum += nums[k];
    //                 // System.out.print(nums[k] + " ");
    //             }
    //             if (sum > maxSum) {
    //                 maxSum = sum;
    //             }
    //             // System.out.println();
    //         }
    //     }
    //     System.out.println(maxSum);
    // }
    

}
// public static void main(String[] args) {
// int arr[] = {-1};
// // ArrayList<int[]> list = new ArrayList<>();
// int n[] = new int[arr.length];
// int m = 0;
// int sum =0, presum = 0;
// for(int i = 0; i<arr.length; i++){
// for(int j = i; j<arr.length; j++){
// int a[] = new int[j-i+1];
// m = 0;
// for(int k = i; k<=j; k++){
// a[m] = arr[k];
// m++;
// sum+=arr[k]
// }
// // list.add(a);
// if(i == 0) presum = sum;
// if(sum > presum){
// presum = sum;
// }
// sum = 0;
// }
// }

// for(int i = 0; i<list.size(); i++){
// int b[] = list.get(i);
// for(int j = 0; j<b.length; j++){
// sum+=b[j];
// }
// if(i == 0) presum = sum;
// if(sum > presum){
// presum = sum;
// }
// sum = 0;
// }

// }
// }
