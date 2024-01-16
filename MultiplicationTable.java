import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the multiplication table of: ");
        int n = sc.nextInt();
        System.out.println("The table of " + n + " is: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
