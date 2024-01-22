import java.util.*;

public class InvertedHalfPyramidWithNumber {
    public static void InvertedHalfPyramid(int n){
        // Outer loop
        int num = 1;
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(num);
                num++;
            }
            num = 1;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        InvertedHalfPyramid(n);
    }
}
