import java.util.*;

public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary income: ");
        int salary = sc.nextInt();

        if(salary<500000){
            System.out.println("Your tax is 0%");
        }
        else if(salary<1000000 && salary>=500000){
            System.out.println("Your tax is 20%");
        }
        else if(salary>1000000){
            System.out.println("Your tax is 30%");
        }
    }
}
