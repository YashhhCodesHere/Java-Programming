import java.util.*;

public class TrueForEven {
    public static boolean isEven(int evenOdd){
        boolean isEven = true;
        if(evenOdd % 2 == 1){
            isEven = false;
        }
        return isEven;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int evenOdd = sc.nextInt();
    isEven(evenOdd);
    if(isEven(evenOdd)){
        System.out.println("Your entered number " + evenOdd + " is Even!");
    } else {
        System.out.println("Your entered number " + evenOdd + " is Odd!");
    }
    }
}