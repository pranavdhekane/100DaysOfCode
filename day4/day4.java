package day4;

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Enter a number to search : ");
        int n = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if(n == array[i]) {
                System.out.println(n + " found at index " + i);
                return;
            }
        }

        System.out.println("The given number is not present in the array");
    }
}
