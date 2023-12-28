import java.util.*;

public class AreaCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi * r * r;
        System.out.print("The area of the circle is: ");
        System.out.println(area); 
    }    
}
