import java.util.*;

public class SumInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a + b;

        System.out.print("The Sum of your given input is: ");
        System.out.println(sum);
    }
}
