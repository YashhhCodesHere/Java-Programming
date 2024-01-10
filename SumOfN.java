import java.util.*;

public class SumOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'N': ");
        int counter = sc.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= counter) {
            sum += start;
            start++;
        }
        System.out.println("The sum of 1 to N is: " +sum);
    }
}
