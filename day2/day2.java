package day2;

public class day2 {
    public static void main(String[] args) {
        int n = 15;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
