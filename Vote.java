import java.util.*;

public class Vote{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("Congratulation... You're eligible to vote!");
        }else{
            System.out.println("Sorry! You're Not eligible to vote!");
        }
    }
}