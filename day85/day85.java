package day85;

import java.util.ArrayList;

public class day85{
    public static int[][] merge(int[][] intervals) { 
        ArrayList<int[]> list = new ArrayList<>();

        int start = 0, end = 0;
        for(int i = 0; i<intervals.length; i++){
            start = intervals[i][0];
            end = intervals[i][1];

            if(i == intervals.length -1){
                
            } 
            else {
                if(start >= intervals[i+1][0]){
                    start = intervals[i+1][0];
                    end = intervals[i+1][1];
                }
                if(end >= intervals[i+1][0]){
                    end = intervals[i+1][1];
                } 
                i++;
            }
            
            list.add(new int[]{start, end});
        }

        intervals = new int[list.size()][2];

        for(int i = 0; i<list.size(); i++){
            intervals[i] = list.get(i);
        }
        
        return intervals;
    
    }
    public static void main(String args[]){
        int [][]intervals ={
          {1, 4}, {0, 4}
        };

        for(int i = 0; i<intervals.length; i++){
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
        System.out.println();

        int m[][] = merge(intervals);

        for(int i = 0; i < m.length; i++){
            System.out.println(m[i][0] + " " + m[i][1]);
        }
        
    }
}