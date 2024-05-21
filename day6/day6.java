package day6;

import java.util.Scanner;

public class day6 {
    public static void rotate(int arr[], int d, int n){
        int[] temp = new int[n];
        int j = 0;
        for(int i = d; i< n; i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i = 0; i<d; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i =0; i<n; i++){
            arr[i] = temp[i];
        }

        return;
    }

    public static void printArray(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input array size 
        System.out.println("Enter array size and then array elements");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input array 
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt(); 
        }

        //input positions (d)
        System.out.println("Enter d");
        int d = sc.nextInt();

        //printing original array 
        System.out.println("Original Array : ");
        printArray(arr);

        rotate(arr, d, n);
        
        //printing rotated array
        System.out.println("Printing arry rotated by " + d + " postions");
        printArray(arr);
    }
}
