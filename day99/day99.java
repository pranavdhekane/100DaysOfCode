package day99;
public class day99 {
    public static int Bad = 1702766719;
    public static boolean isBadVersion(int x){
        if(x >= Bad)
        return true;
        else 
        return false;
    }
    public static int bad(long low, long high){
        int mid;
        long m;
        while(low <= high){
            m = (low+high)/2;
            mid = (int)m;
            if(isBadVersion(mid)){
                if(isBadVersion(mid-1)){
                    high = mid-1;
                } else{
                    return mid;
                }
            } else {
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(bad(1, 2126753390));
    }

    
}
