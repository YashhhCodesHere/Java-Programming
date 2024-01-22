import java.util.*;

public class InvertedAndRotatedHalfPyramid {
    public static void InvPyramid(int n){
        // Outer loop:-
        for(int i = 1; i <= n; i++){
            // For Spaces:-
           for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
           }
           // For Stars:-
           for(int j = 1; j <= i; j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Order of Inverted and Rotated Pyramid you want: ");
    int n = sc.nextInt();
    InvPyramid(n);
    }
}
