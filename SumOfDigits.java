import java.util.*;

public class SumOfDigits {
    public static int SumOfDigit(int num){
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = (num % 10);
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your number: ");
    int num = sc.nextInt();
    SumOfDigit(num);
    System.out.println("Sum of the digits are: " + SumOfDigit(num));
    }
}
