import java.util.*;

public class SwitchCase {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1, 2, or 3: ");
    int number = sc.nextInt();

    switch(number) {
        case 1 : System.out.println("A");
        case 2 : System.out.println("B");
        case 3 : System.out.println("C");
        default : System.out.println("The value you entered doesn't lies in our range!");
    }
  }
}