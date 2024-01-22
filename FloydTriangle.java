import java.util.*;

public class FloydTriangle {
    public static void FloydTriangle(int n){
        int num = 1;
        // Outer loop:-
        for(int i = 1; i <= n; i++){
            // Inner loop:-
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want in the pattern: ");
        int n = sc.nextInt();
        FloydTriangle(n);
    }
}
