import java.util.*;

public class Print1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to be printed: ");
        int number = sc.nextInt();
        int counter = 1;

        while(counter <= number){
            System.out.print(counter + " ");
            counter++;
        }

    }

}
