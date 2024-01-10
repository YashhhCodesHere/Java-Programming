import java.util.*;

public class ReverseOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. you want the reverse of: ");
        int original = sc.nextInt();
        
        while(original > 0){
        System.out.print(original % 10); //To get the last digit of the number
        original = original / 10; //To remove the last digit of the number
        }
        System.out.println();
    }
}
