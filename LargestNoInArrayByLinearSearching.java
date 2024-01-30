import java.util.*;

public class LargestNoInArrayByLinearSearching {
    public static int LargestNum(int numbers[]){
        int Largest = Integer.MIN_VALUE; // Stores minus infinity or smallest value to the variable Largest!

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > Largest){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
    int numbers[] = {1, 2, 6, 3, 5};
    LargestNum(numbers);
    System.out.println("Largest no. in the given array is: " + LargestNum(numbers));
    }
}
