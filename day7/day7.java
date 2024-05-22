import java.util.Scanner;

public class day7 {
    public static int insertEl(int arr[], int el, int n, int capacity, int pos){
        if(n>=capacity){
            System.out.println("Array capapcity is reached");
            return n;
        }
        for(int i = pos; i<n+1; i++){
            
        }
        return n+1;
    }
    public static void printArray(int arr[], int n){
        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        //input n and array elements
        System.out.println("Enter n and then Array elements"); 
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        //input element to append and its position
        System.out.println("Enter element to add");
        int el = sc.nextInt();

        System.out.println("Enter Position of element");
        int pos = sc.nextInt();

        System.out.println("Array before Inserting a element");
        printArray(arr, n);
        
        n = insertEl(arr, el, n, arr.length, pos);
        System.out.println("Array After Inserting a element");
        printArray(arr, n);
    }

    

}