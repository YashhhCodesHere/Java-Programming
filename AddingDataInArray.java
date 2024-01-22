import java.util.*;

public class AddingDataInArray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int marks[] = new int[10];

    // Length of an array:-
    System.out.println("Lenght of the array you created are: " + marks.length + "\n");
    
    System.out.print("Enter your Maths marks: ");
    marks[0] = sc.nextInt(); //Maths marks
    System.out.print("Enter your Chemistry marks: ");
    marks[1] = sc.nextInt(); //Chem marks
    System.out.print("Enter your Physics marks:" );
    marks[2] = sc.nextInt(); //Physics marks

    System.out.println("\nYour Maths marks is: " + marks[0]);
    System.out.println("Your Chemistry marks is: " + marks[1]);
    System.out.println("Your Physics marks is: " + marks[2]);

    // Average of all marks I got:-
    int Average = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("\nAverage of all your marks is: " + Average);
    
    // Updating marks of Chemistry!
    marks[1] = 99;
    System.out.println("\nNow after correction, Your Chemistry marks is: " + marks[1]);

    // Adding 2 marks of Maths which I got after re-evaluation!
    marks[0] += 2; // 2 marks is added to math's marks
    System.out.println("\nNow, Your Maths marks is: " + marks[0]); 

    }
}
