import java.util.*;

public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        if(a%2==1){
            System.out.println("The number you entered is ODD!");
        }
        else{
            System.out.println("The number you entered is EVEN!");
        }
    }
}
