package day41;

import java.util.*;

public class day41{
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        
        return set.size();
    }
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i =0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
                set.remove(arr2[i]); // once comapared then should be removed
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        System.out.println(intersection(arr1, arr2));
    }
}