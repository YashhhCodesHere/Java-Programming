import java.util.*;

public class ReverseOfArray {
    public static void Reversed(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int numbers[] = new int[6];
    // For taking input to an array...
    for(int i = 0; i < numbers.length; i++){
    System.out.print("Enter the number you want to put in " + i + "th index of an array: ");
    numbers[i] = sc.nextInt();
    }
    Reversed(numbers);
    System.out.print("Reversed of your given array is: ");
    // Output:-
    for(int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
    }
}
