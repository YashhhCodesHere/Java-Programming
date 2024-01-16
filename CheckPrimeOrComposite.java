import java.util.*;

public class CheckPrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check either it's Prime or NOT: ");
        int n = sc.nextInt();
        for(int i = 2; i <= (n - 1) ; i++){
            if(n % i == 0){
                System.out.println("You've entered a Composite number!");
                break;
            }else{
                System.out.println("You've entered a Prime number!");
                break;
            }
        }
    }
}
