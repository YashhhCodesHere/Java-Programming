import java.util.*;

public class PrintingOfPairsOfElementsOfArray {
    public static void PrintPairs(int numbers[]){
        int tp = 0;
        for(int i = 0; i < numbers.length; i++){
            int left = numbers[i];
            for(int j = (i + 1); j < numbers.length; j++){
                int right = numbers[j];
                System.out.print("(" + left + ", " + right + ")\t");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs which is printed are: " + tp);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        PrintPairs(numbers);
    }
}
