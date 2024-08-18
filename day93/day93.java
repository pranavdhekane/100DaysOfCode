package day93;

import java.util.HashMap;
import java.util.Map;

public class day93 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i] , 1);
            }
        }

        int max = 0, j = 0;
        for(Map.Entry<Integer, Integer> el : map.entrySet()){
            if(el.getValue() > max){
                j = el.getKey();
                max = el.getValue();
                System.out.println(el.getKey() + " " + el.getValue());
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int nums[] = {3, 3, 4};
        System.out.println(majorityElement(nums));
    }
}