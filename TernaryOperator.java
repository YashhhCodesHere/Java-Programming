import java.util.*;

public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int number = sc.nextInt();
        String OddEven = ((number%2)==0) ? "EVEN" : "ODD";
        System.out.println("Your entered number is: " + OddEven);
    }
}
