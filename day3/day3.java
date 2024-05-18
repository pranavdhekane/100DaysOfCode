package day3;

import java.util.Scanner;

public class day3 {
    public static void fib(int num1, int num2 ,int n){
        int temp;
        System.out.print(num1 + " " + num2 + " ");
        for(int i=0; i<n-2; i++){
            temp = num1+ num2;
            System.out.print(temp + " ");
            num1 = num2;
            num2 = temp;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n = sc.nextInt();
        fib(num1, num2, n);
    }
}
