import java.util.*;

public class DoWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        String x = "Hello World!";

        do {
            System.out.print(x + ", ");
            counter++;
        } while (counter <= 10);
    }
}
