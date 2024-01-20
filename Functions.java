import java.util.*;

public class Functions {
    //We must have to add return whenever it's return type is other than void!
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World\n\n");
    }
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);
    }
    public static void main(String args[]) {
        System.out.println("Now we're going to print Hello World 5 times by calling a function...\n");
        printHelloWorld();

        calculateSum();
        
    }
}
