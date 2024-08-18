package day82;

import java.util.ArrayList;

public class day82 {
   
    public static ArrayList<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;

        String str = new String();

        for(int i = 0; i<nums.length ; i++) {
            if(start == Integer.MIN_VALUE && end == Integer.MIN_VALUE){
                start = nums[i];
            }
            if(start!=Integer.MIN_VALUE) {
                try {
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
                    
                } catch (Exception e) {
                }
            }
        }

        if(start != Integer.MIN_VALUE) {
            if(end != Integer.MIN_VALUE){
                list.add(Integer.toString(start) + "->" + Integer.toString(end));
            }
            else {
                list.add(Integer.toString(start));
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int nums[] = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
}