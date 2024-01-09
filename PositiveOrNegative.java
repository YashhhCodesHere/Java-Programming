import java.util.*;

public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        if(number >= 0) {
            System.out.println("The given no. is positive!");
        }
        else{
            System.out.println("The given no. is negative!");
        }
    }
}