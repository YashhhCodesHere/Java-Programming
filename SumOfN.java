import java.util.*;

public class SumOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int sum;
        int counter = sc.nextInt();
        while (start <= counter) {
            sum = start + 1;
            start++;
        }
        System.out.println(sum);
    }
}
