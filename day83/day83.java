package day83;

import java.util.ArrayList;

public class day83 {
    public static void add(ArrayList<String> list, long start) {
        list.add(String.valueOf(start));
    }

    public static void add(ArrayList<String> list, long start, long end) {
        list.add(String.valueOf(start) + "->" + String.valueOf(end));
    }

    public static ArrayList<String> summaryRanges(int nums[]) {
        ArrayList<String> list = new ArrayList<>();

        long start, end;
        long MIN = Long.MIN_VALUE;
        start = end = MIN;
        try {
            for (int i = 0; i < nums.length; i++) {
                if (start == MIN && end == MIN) {
                    start = nums[i];
                }
                end = nums[i];
                if (start != MIN) {
                    if (nums[i] + 1 != nums[i + 1]) {
                        if (start == end) {
                            add(list, start);
                        } else {
                            add(list, start, end);
                        }
                        start = end = MIN;
                    }

                }
            }
        } catch (Exception e) {
        }

        if(start == end && end == MIN) return list;
        if (start == end) {
            add(list, start);
        } else {
            add(list, start, end);
        }

        return list;

    }

    public static void main(String[] args) {
        int nums[] = { };
        System.out.println(summaryRanges(nums));
    }
}
