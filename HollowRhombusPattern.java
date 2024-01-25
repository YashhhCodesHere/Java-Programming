import java.util.*;

public class HollowRhombusPattern {
    public static void HollowRhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n | j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of length of the pattern you want: ");
    int n = sc.nextInt();
    HollowRhombus(n);
    }
}