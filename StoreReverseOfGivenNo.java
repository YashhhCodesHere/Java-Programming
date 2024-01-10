import java.util.*;

public class StoreReverseOfGivenNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int OriginalNum = sc.nextInt();
        int ReversedNum = 0;
        while(OriginalNum > 0){
            ReversedNum = (ReversedNum * 10) + (OriginalNum % 10);
            OriginalNum = OriginalNum / 10;
        }
        System.out.println("Reverse of the number stored in the variable is: " + ReversedNum);
    }
}
