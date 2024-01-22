import java.util.*;

public class ZeroOneTriangle {
    public static void Zero_One_Triangle(int n){
        // Outer loop:-
        for(int i = 1; i <= n; i++){
            // Inner loop:- 
            for(int j = 1; j<= i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                } else if ((i+j)%2==1){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines you want in the pattern: ");
        int n = sc.nextInt();
        Zero_One_Triangle(n);
    }
}
