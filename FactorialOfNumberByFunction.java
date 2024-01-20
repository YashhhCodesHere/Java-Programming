import java.util.*;

public class FactorialOfNumberByFunction {
    public static int factorial(int input){
        int fact = 1;
        for(int i = 1; i <= input; i++){
            fact *= i; 
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the factorial of: ");
        int input = sc.nextInt();
        factorial(input);
        System.out.println(factorial(input));
    }
}
