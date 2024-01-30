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
    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    System.out.print("Enter the number key (No. you want to search in the array): ");
    int key = sc.nextInt();
    System.out.println("If -1 gets printed then you entered key doesn't exists in the given array!");
    LinearSearch(numbers, key);
    }
}
