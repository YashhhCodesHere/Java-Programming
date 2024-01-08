import java.util.*;

public class Largest2No {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        System.out.print("The Greatest of two no. you entered is: ");

        if(a>b){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}
