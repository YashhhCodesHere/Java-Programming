import java.util.*;

public class PrintingAllSubarrays {
    public static void PrintSubarrays(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                for(int k = start; k < end; k++){  // For Printing
                    System.out.print(numbers[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of SubArrays of the given arrays: " + ts);
    }
    public static void main(String args[]){
    int numbers[] = {1, 3, 5, 7, 9};
    PrintSubarrays(numbers);

    }
}