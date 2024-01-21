import java.util.*;

public class CheckPalindromeNumber {
    public static void isPalindrome(int input){
        int originalNum = input;
        int reverse = 0;
        while (originalNum > 0){
            int lastDigit = (originalNum % 10);
            reverse = (reverse * 10) + lastDigit;
            originalNum /= 10;
        }
        System.out.println("Reverse of your number is: " + reverse);
        if(input == reverse){
            System.out.println(input + " is Palindrome number!");
        } else if (input != reverse) {
            System.out.println(input + " is Not a Palindrome number!");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check it's Palindrome or NOT: ");
        int input = sc.nextInt();
        isPalindrome(input);
    }
}
