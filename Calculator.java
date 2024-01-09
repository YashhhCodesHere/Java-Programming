import java.util.*;

//This kind of code is called as "User Driven Code" where user perform all the input through the entire code and get their output!

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First no: ");
        int a = sc.nextInt();
        System.out.print("Enter your Second no: ");
        int b = sc.nextInt();

        System.out.print("You can Perform +, -, *, /, % with the above two number entered: ");
        char Operation = sc.next().charAt(0);

        switch(Operation) {
            case '+' : System.out.println("The result is: " + (a + b));
                break;
            case '-' : System.out.println("The result is: " + (a - b));
                break; 
            case '*' : System.out.println("The result is: " + (a * b));
                break;
            case '/' : System.out.println("The result is: " + (a / b));
                break;
            case '%' : System.out.println("The result is: " + (a % b));
                break;
            default : System.out.println("Please enter one of the operation as it is as mentioned above ");
        }
    }
}
