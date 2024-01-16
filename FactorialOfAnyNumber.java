import java.util.*;

public class FactorialOfAnyNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number of which you want the factorial of: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <=num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of the number is: " + factorial);
    }
}