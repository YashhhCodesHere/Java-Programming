import java.util.*;

public class WeekName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day no. from 1 to 7 of the week to get their name: ");
        int Week = sc.nextInt();

        switch(Week){
            case 1 : System.out.println("Sunday");
                break;
            case 2 : System.out.println("Monday");
                break;
            case 3 : System.out.println("Tuesday");
                break;
            case 4 : System.out.println("Wednesday");
                break;
            case 5 : System.out.println("Thursday");
                break;
            case 6 : System.out.println("Friday");
                break;
            case 7 : System.out.println("Saturday");
                break;
            default : System.out.println("Enter the no. from the given range!");
        }
    }
}
