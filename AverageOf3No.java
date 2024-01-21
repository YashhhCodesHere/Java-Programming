import java.util.*;

public class AverageOf3No {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter your third number: ");
        double c = sc.nextDouble();
        average(a, b, c);
        System.out.println("The average of your numbers " + a + ", " + b + ", " + c + " are: " + average(a, b, c));
    }
    public static double average(double a, double b, double c){
        return (a + b + c)/3;
    }
}