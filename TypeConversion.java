import java.util.*;

public class TypeConversion {
    public static void main(String args[]){
        int a = 20; 
        long b = a;
        System.out.println("The value of b is: " + b);

        char x = 'A';
        System.out.println("\nThe value of A in int datatype is: " + (int)(x));
        char y = 'a';
        System.out.println("The value of B in int datatype is: " +(int)(y));


        int j = 15;
        float k = 20.2f;
        long l = 125;
        double m = 133.69;
        System.out.println("The value of Whole conversion converted in double type is: "+ (j + k - l + m));
    }
}
