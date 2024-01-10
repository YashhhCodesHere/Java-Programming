import java.util.*;

public class WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(counter <= 10){
            System.out.println("Hello World! ");
            counter += 1;
            //The above line will increase the value of counter by 1...
            //We can also use (counter++)
        }
        System.out.println("Now Hello World is printed 10 times using while loop");
    }
}
