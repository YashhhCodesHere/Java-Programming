import java.util.*;

public class SumOfOddAndEvenIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int OddSum = 0;
        int EvenSum = 0;
        
        do{
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            if(number % 2 == 0){
                EvenSum += number;
            }else if(number % 2 == 1) {
                OddSum += number;
            }
            System.out.print("Enter '1' if you want to input another number, If NOT enter any other number: ");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of the even numbers you entered is: " + EvenSum);
        System.out.println("Sum of the odd numbers you entered is: " + OddSum);
    }
}
