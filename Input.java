import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        System.out.println(input);
    //Here everything after space is left whenever we use sc.next!

        String name = sc.nextLine();
        System.out.println(name);
    //Here Space is included while writing the string whenever we use sc.nextLine!

        int number = sc.nextInt();
        System.out.println(number);
    //Number is taken as input throught nextInt!

        float price = sc.nextFloat();
        System.out.println(price);
    }
}