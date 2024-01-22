import java.util.*;

public class HollowRectangle {
    public static void Hollow_Rectangle(int totRows, int totCols){
        // Outer Loop:-
        for(int i = 1; i <= totRows; i++){
            // Inner Loop:-
            for(int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the total number of rows you want: ");
    int totRows = sc.nextInt();
    System.out.print("Enter the total number of columns you want: ");
    int totCols = sc.nextInt();
    Hollow_Rectangle(totRows, totCols);
    }
}
