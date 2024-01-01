import java.util.*;

public class TypeCasting {
    public static void main(String args[]){
        float a = 36.8f;
        int b = (int) a;
        //In the above line type casting occured by using int under the parenthesis.
        System.out.println("The value of a is: "+ a);
        System.out.println("The value of a using TypeCasting is: "+ b);

        char ch = 'a';
        int ch1 = ch;
        System.out.println(ch1);

        char c = 'A';
        int ch2 = c;
        System.out.println(ch2);
    }
}
