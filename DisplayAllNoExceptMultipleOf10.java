import java.util.*;

public class DisplayAllNoExceptMultipleOf10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("To exit the code, Please enter 'Ctrl + C'");
        while(true) {
            System.out.print("Enter your number: ");
            int iterator = sc.nextInt();
            if((iterator%10) == 0) {
                System.out.println("Your entered value is the multiple of 10, Hence, It'll not gonna be Displayed!");
                continue;
            }
            System.out.println("You entered number is: " + iterator);
        }
    }
}
