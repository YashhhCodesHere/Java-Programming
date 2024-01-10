import java.util.*;

public class ForLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many time you want to print Hello World: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Hello World! ");
        }
    }
}
