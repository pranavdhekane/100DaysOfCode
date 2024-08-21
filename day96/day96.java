import java.util.Stack;

public class day96 {
    // public static int[] dailyTemperatures(int[] temperatures) {
    //     int j;
    //     int n = temperatures.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         j = i + 1;

    //         while (temperatures[j] <= temperatures[i] && j < n) {
    //             j++;
    //             if (j == n) {
    //                 break;
    //             }
    //         }

    //         if (j == n)
    //             temperatures[i] = 0;
    //         else
    //             temperatures[i] = j - i;
    //     }
    //     temperatures[n - 1] = 0;

    //     return temperatures;
    // }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for(int i : temperatures){
            st1.push(i);
        }

        int count = 0;
        int i = 0;
        int curr;
        while(st1.isEmpty() == false){
            count = 0;
            curr = st1.pop();

            while(st1.peek() < curr){
                st2.push(st1.pop());
                count++;
                if(st1.isEmpty()){
                    break;
                }
            }
            if(st1.isEmpty()) temperatures[i++] = 0;
            else temperatures[i++] = count;

            while(!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }
        return temperatures;
    }
    public static void main(String[] args) {
        int t[] = { 1, 3, 4 };
        int a[] = dailyTemperatures(t);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
