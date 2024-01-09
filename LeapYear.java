import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if((year % 4) == 0){
            if((year%100)==0){
                if((year%400)==0){
                    System.out.println("The Year you entered is Leap Year!");
                }
            }
        }
        else{
            System.out.println("The Year is not a Leap Year!");
        }
    }
}
