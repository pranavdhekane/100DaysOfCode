package day5;

public class day5 {
    static void insertElement(int arr[], int n, int x, int pos) {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 6};
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        insertElement(arr, 4, 3, 2);
        
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
