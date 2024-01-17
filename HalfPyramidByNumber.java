import java.util.Scanner;

public class HalfPyramidByNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        for(int lines = 1; lines <= 4; lines++){
            for(num = 1; num <= lines; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
