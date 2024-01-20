import java.util.*;

public class SumCalculatorUsingDataTypesOverloading {
    //Funtion to calculate int sum:-
    public static int sum(int a, int b){
        return (a + b);
    }
    //Function to calculate float sum:-
    public static float sum(float a, float b){
        return (a + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please tell which data type you want (1 for int and 2 for float): ");
        int dataType = sc.nextInt();
        if(dataType == 1){
            System.out.println("Enter your both number one by one: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum(a, b);
            System.out.println(sum(a, b));
        } else if(dataType == 2){
            System.out.println("Enter your both number one by one: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            sum(a, b);
            System.out.println(sum(a, b));
        }
    }
}
