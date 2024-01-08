import java.util.*;

public class Largest3No {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of C: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is largest among the all the input");
        }
        else if(b>a && b>c){
            System.out.println("B is largest among the all the input");
        }
        else if(c>a && c>b){
            System.out.println("C is largest among the all the input");
        }
    }
}
