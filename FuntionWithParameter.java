import java.util.*;

public class FuntionWithParameter {
    public static int calculateSum(int num1, int num2) //Here num1 and num2 are parameters or Formal Parameters...
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter you second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //Here a and b are arguements or Actual Parameters...
        System.out.println("The sum of the two number is: " + sum);
    }
}
