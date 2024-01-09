import java.util.*;

public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your body temperature: ");
        double temp = sc.nextDouble();
        if(temp>100) {
            System.out.println("You've Fever!");
        }
        else{
            System.out.println("You don't have Fever!");
        }
    }
}

