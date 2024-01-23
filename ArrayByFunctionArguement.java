import java.util.*;

public class ArrayByFunctionArguement {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 2;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int marks[] = {92,95,97};
        update(marks);
        System.out.println(marks);

        // Printing marks in array format:-
        System.out.println("Updated marks: " + Arrays.toString(marks));

        // Printing our marks:-
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
