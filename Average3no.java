import java.util.*;

public class Average3no {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int A = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int B = sc.nextInt();
        System.out.print("Enter the Third number: ");
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("The average of your given three numbers are: "+ average);
    }
}