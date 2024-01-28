import java.util.*;

public class PrintingHelloWorldnTimes {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many times you want 'Hello World' to be printed? ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++){
        System.out.print("Hello World!\t");
    }
    }
}