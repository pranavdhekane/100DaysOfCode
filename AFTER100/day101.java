package AFTER100;

import java.util.*;

public class day101 {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] use;

    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        use = new boolean[nums.length];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            use[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            twoSum(nums, 0 - nums[i], i, map);
        }

        return list;
    }

    public static void twoSum(int[] nums, int target, int idx, HashMap<Integer, Integer> map) {
        int complement;
        for (int i = 0; i < nums.length-2; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i && map.get(complement) != idx) {
                if(use[idx] == false || use[i] == false || use[map.get(complement)] == false){
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[idx]);
                    l.add(complement);
                    l.add(nums[i]);
        
                    use[idx] = true;
                    use[i] = true;
                    use[map.get(complement)] = true;
        
                    list.add(l);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 0 };
        ArrayList<ArrayList<Integer>> list = threeSum(nums);
        System.out.println(list);
    }

}
