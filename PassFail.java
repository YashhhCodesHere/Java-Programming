import java.util.*;

public class PassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String Result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Your result is: " + Result);
    }
}
