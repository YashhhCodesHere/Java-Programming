import java.util.*;

public class MaximumSubarraySum {
    public static void Max_Sum_Of_Subarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += numbers[k];
                }
                System.out.println("The current sum is: " + currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The sum of the Subarrays is: " + maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number at " + i + "th index: ");
            numbers[i] = sc.nextInt();
        }
        Max_Sum_Of_Subarray(numbers);

    }
}
