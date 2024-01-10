import java.util.*;

public class StarPatternIn4Lines {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String StarPattern = "|* * * *|";

        System.out.println("\nThe star pattern printed by For loop: \n");
        
        for(int i = 1; i <= 4; i++){
            System.out.println(StarPattern);
        }
        System.out.println("\n");
        //Same can be done by while loop also!
        System.out.println("The star pattern printed by While loop: \n");

        int j = 1;
        while(j <= 4){
            System.out.println(StarPattern);
            j++;
        }
    }
}