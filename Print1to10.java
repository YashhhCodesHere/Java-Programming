import java.util.*;

public class Print1to10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
