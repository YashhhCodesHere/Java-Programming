import java.util.*;

public class AreaSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side of the square: ");
        double side = sc.nextDouble();
        double area = side * side;
        
        System.out.println("The area of the square is: "+ area + " cm square");
    }    
}
