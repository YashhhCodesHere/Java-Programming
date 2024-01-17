import java.util.*;

public class InvertedStarPattern {
    public static void main(String args[]){
        int n = 5;

        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= (n - line + 1); star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




// Another Concept:-
// for(int line = 1; line <= 4; line++){
//     for(int star = 4; star >= line; star--){
//         System.out.print("* ");
//     }
//     System.out.println();
// }