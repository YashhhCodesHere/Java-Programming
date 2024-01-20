import java.util.*;

public class ProductByFunction {
    public static int product(int a, int b){
        int product = (a * b);
        System.out.println("\nThe product of the numbers you entered are: " + product);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = sc.nextInt();
        System.out.print("Enter second no: ");
        int b = sc.nextInt();
        product(a, b);

        // The line below show the return value of the product function...
        System.out.println(product(a, b));
        // This means that whatever will be the return value will be the actual value of the whole function!
    }
}
