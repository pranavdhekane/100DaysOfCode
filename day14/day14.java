package day14;

public class day14 {
    
    public static void main(String [] args){
        int arr[] = { 7 , 9, 3, 5, 2};
        for(int i = 0; i<arr.length ; i++){
            int current = arr[i];
            int j  =i-1;
            while(j>=0 && current < arr[j] ){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
