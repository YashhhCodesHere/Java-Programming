import java.util.*;

public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("\nThe sum of a and b is: " + sum);
        System.out.println("\nThe difference of a and b is: " + difference);
        System.out.println("\nThe product of a and b is: " + product);
        System.out.println("\nThe quotient of a and b is: " + quotient);
        System.out.println("\nThe remainder obtained when a and b is divided: " + remainder);
    }
}
