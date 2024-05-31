package day15;

public class day15 {
    public static int cal(int x, int n){
        if(x==0){
            return 0;
        }
        if(0==n){
            return 1;
        }
        int xPowernm1  = cal(x, n-1);
        int xPower = x * xPowernm1;
        return xPower;
    }
    public static void main(String[] args) {
        int x = 2, n =5;
        System.out.println(cal(x, n));        
    }
}
