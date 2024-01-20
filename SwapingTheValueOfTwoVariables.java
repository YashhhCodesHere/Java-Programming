public class SwapingTheValueOfTwoVariables {
    public static void main(String args[]) {
        int a = 50;
        int b = 100;
        // Swapping the values:-
        int temp = a;
        System.out.println(temp); // This line for understanding!
        System.out.println(a); // This line for understanding!
        a = b;
        System.out.println(a);// This line for understanding!
        b = temp;
        // Printing the Swapped values:-
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
