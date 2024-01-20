import java.util.*;

public class BinomialCoefficient {
    public static int factorial(int a) {
        int fact = 1;
        for(int i = 0; i <= a; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binCoef(int n, int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFactt = factorial(n - r);
        int ncr = (nFact)/(rFact*nmrFactt);
        return ncr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        binCoef(n, r);
        System.out.println("The value of nCr is: " + binCoef(n, r));
    }
    
}
