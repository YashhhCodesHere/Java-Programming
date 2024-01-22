import java.util.*;

public class MaximumValueFromInput {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your first number: ");
    int a = sc.nextInt();
    System.out.print("Enter your second number: ");
    int b = sc.nextInt();
    // int c = sc.nextInt();
    // int d = sc.nextInt();
    // int e = sc.nextInt();
    int max = Math.max(a, b);
    System.out.println(max + " is the largest number among all!");
    }
}
