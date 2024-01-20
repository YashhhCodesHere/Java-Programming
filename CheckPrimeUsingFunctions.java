import java.util.*;

public class CheckPrimeUsingFunctions {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 1){
            isPrime = true;
        }
        for(int i = 2; i <= (n-1); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check either it's prime or not: ");
        int num = sc.nextInt();
        isPrime(num);
        System.out.println("Your given number is Prime: " + isPrime(num));

    }
}
