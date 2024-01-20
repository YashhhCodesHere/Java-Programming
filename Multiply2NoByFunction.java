import java.util.*;

public class Multiply2NoByFunction {
    public static int multiply(int a, int b){
        int product = (a * b);
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int a = sc.nextInt();
        System.out.print("Enter your no: ");
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("Product of your numbers are: " + prod);
    }
}
