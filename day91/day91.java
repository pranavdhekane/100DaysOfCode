package day91;
public class day91{
        public static int search(int low, int high, int key, int[] nums){
            if(low > high) return -1;
            int mid = (low + high)/2;
            if(nums[mid] == key){
                return mid;
            } else if(nums[mid] > key){
                return search(low, mid-1, key, nums);
            } else {
                return search(mid+1, high, key, nums);
            }
        }
        public static int[] twoSum(int[] numbers, int target) {
            for(int i = 0; i < numbers.length -1; i++){
                int key = target - numbers[i];
                int found = search(i+1, numbers.length-1, key, numbers);
                if(found != -1){
                    return new int[] {i, found};
                } else{}
            }
            
            return new int[2];
        }
        public static void main(String[] args) {
            int []n = {2, 7, 11, 15};
            int p[] = twoSum(n, 18);
            System.out.println(p[0] + " " +  p[1]);
        }
}