package day8;

public class day8 {
    public static void subArray(int arr[], int start, int end){
        if(end == arr.length){
            return;
        } else if(start > end){
            subArray(arr, 0, end+1);
        } else {
            System.out.print("[");
            for(int i = start; i<end; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[end] + "]");
            subArray(arr, start+1, end);
        }
        return;
    }
    public static int search(int arr[],int key, int high, int low){
        if(high < low){
            return -1;
        } 
        int mid = (high+low)/2;
        if(key == arr[mid]){
            return mid;
        }
        if(key>arr[mid]){
            return search(arr, key, high, mid+1);
        } else {
            return search(arr, key, mid-1, low);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3};
        subArray(arr, 0, 0);
    }
}
