import java.util.*;

public class DecimalToBinary {
    public static void DecToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int remainder = (decNum % 2);
            binNum = binNum + (int)(remainder * Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        System.out.println("The Binary code of " + myNum + " is: " + binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number: ");
        int decNum = sc.nextInt();
        DecToBin(decNum);
    }
}
