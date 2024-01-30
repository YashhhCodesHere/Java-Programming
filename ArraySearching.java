import java.util.*;

public class ArraySearching {
    public static int LinearSearch(int numbers[], int key){
        for(int i = 0; i <= numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    System.out.print("Enter the number key (No. you want to search in the array): ");
    int key = sc.nextInt();

    int index = LinearSearch(numbers, key);
    if(index == -1){
        System.out.println("Key NOT found!");
    }else{
        System.out.println("\nYour key is at the " + index + "th index.");
    }
    }
}
