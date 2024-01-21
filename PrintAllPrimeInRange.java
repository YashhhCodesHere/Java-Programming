import java.util.*;

public class PrintAllPrimeInRange {
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n){
        System.out.print("Prime numbers in the range 2 to " + n + ": ");
        for(int i = 2; i <= n; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        PrimeInRange(n);
    }
}