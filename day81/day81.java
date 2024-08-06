package day81;

import java.util.ArrayList;

public class day81 {
    public static ArrayList<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;

        String str = new String();

        for(int i = 0; i<nums.length-1 ; i++) {
            if(start == Integer.MIN_VALUE && end == Integer.MIN_VALUE){
                start = nums[i];
            }
            if(start!=Integer.MIN_VALUE) {
                if((nums[i] + 1) != nums[i+1]){
                    end = nums[i];
                    if(start == end){
                        str = Integer.toString(start);
                        list.add(str); 
                    } else{
                        str = Integer.toString(start) + "->" + Integer.toString(end);
                        list.add(str);
                    }
                    str = "";
                    start = end = Integer.MIN_VALUE;
                }
            }
        }

        if(start != Integer.MIN_VALUE) 
            list.add(Integer.toString(start));

        return list;
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}
