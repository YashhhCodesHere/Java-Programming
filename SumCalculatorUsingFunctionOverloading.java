import java.util.*;

public class SumCalculatorUsingFunctionOverloading {
    //Sum of two numbers:-
    public static int sum(int a, int b){
        return (a + b);
    }
    //Sum of three numbers:-
    public static int sum(int a, int b, int c){
        return (a + b + c);
    }
    public static int sum(int a, int b, int c, int d){
        return (a + b + c + d);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number of Operand you want (2 to 4 Operand are allowed): ");
        int Operand = sc.nextInt();
        if(Operand == 2){
            System.out.print("Enter first no: ");
            int a = sc.nextInt();
            System.out.print("Enter second no: ");
            int b = sc.nextInt();
            sum(a, b);
            System.out.println("\nYour Sum is: " + sum(a, b));
        } else if(Operand == 3){
            System.out.print("Enter first no: ");
            int a = sc.nextInt();
            System.out.print("Enter second no: ");
            int b = sc.nextInt();
            System.out.print("Enter third no: ");
            int c = sc.nextInt();
            sum(a, b, c);
            System.out.println("\nYour Sum is: " + sum(a, b, c));
        } else if(Operand == 4){
            System.out.print("Enter first no: ");
            int a = sc.nextInt();
            System.out.print("Enter second no: ");
            int b = sc.nextInt();
            System.out.print("Enter third no: ");
            int c = sc.nextInt();
            System.out.print("Enter fourth no: ");
            int d = sc.nextInt();
            sum(a, b, c, d);
            System.out.println("\nYour Sum is: " + sum(a, b, c, d));
        }
    }
}
