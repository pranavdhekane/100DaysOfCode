package day97;

import java.util.ArrayList;
import java.util.Arrays;

public class day97 {
    public static int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int even[] = new int[n / 2 + 1];
        // if(n%2==0) {
        // even[] = new int[n/2];
        // }
        int odd[] = new int[n / 2];

        int k = 0, j = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[j++] = nums[i];
            } else {
                odd[k++] = nums[i];
            }
        }

        Arrays.sort(even);
        if (n % 2 == 0)
            j = 1;
        else 
            j = 0;
        Arrays.sort(odd);
        k = odd.length - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even[j++];
            } else {
                nums[i] = odd[k--];
            }
        }

        return nums;
    }

    
        public static int[] rearrangeArray(int[] nums) {
            ArrayList<Integer> p = new ArrayList<>();
            ArrayList<Integer> n = new ArrayList<>();
    
            for(int i: nums){
                if(i>0){
                    p.add(i);
                } else {
                    n.add(i);
                }
            } 
    
            int N;
            if(p.size() > n.size()) N = n.size();
            else N = p.size();
    
            int j = 0;
            for(int i = 0; i<N; i++){
                nums[j++] = p.get(i);
                nums[j++] = n.get(i);
            }
    
            if(p.size() > n.size()){
                nums[j] = p.get(p.size() -1);
            } else if(p.size() < n.size()) {
                nums[j] = n.get(n.size() -1);
            }
    
            return nums;
        }
    

    public static void main(String[] args) {
        
        int n[] = {3 ,1,-2,-5};
        n = rearrangeArray(n);
        for(int i : n){
            System.out.println(i);
        }

    }
}
