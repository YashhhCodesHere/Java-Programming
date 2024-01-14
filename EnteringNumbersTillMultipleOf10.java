import java.util.*;

public class EnteringNumbersTillMultipleOf10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Your Number: ");
            int Number = sc.nextInt();
            if ((Number % 10) == 0) {
                break;
            }
            System.out.print("You've entered " + Number);
        }
        System.out.println("You're now out of the loop as you entered the number which is divisible by 10!");
    }
}
