import java.util.*;

public class SmallestNoInArrayByLinearSearching {
    public static int SmallestNumber(int numbers[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < Smallest){
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int numbers[] = new int[5];
    for(int i = 0; i < numbers.length; i++){
        System.out.print("Enter a number to store it in " + i + "th index of an " + "array: ");
        numbers[i] = sc.nextInt();
        }
    SmallestNumber(numbers);
    System.out.println("The smallest no. stored in the array is: " + SmallestNumber(numbers));
    }
}
