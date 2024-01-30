import java.util.*;

public class BinarySearch {
    public static int Binary_Searching(int numbers[], int key){
    int start = 0;
    int end = (numbers.length - 1);
    while(start <= end){
        int mid = (start + end) / 2;
        if(numbers[mid] == key){
            return mid;
        }else if(numbers[mid] < key){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
    return -1;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    System.out.print("Enter the key: ");
    int key = sc.nextInt(); 
    Binary_Searching(numbers, key);
    int result = Binary_Searching(numbers, key);
    if(result == -1){
        System.out.println("Your entered key i.e., '" + key + "' doesn't lies in the given array!");
    }else{
        System.out.println("Key is at the " + result + "th position!");
        }
    }
}
