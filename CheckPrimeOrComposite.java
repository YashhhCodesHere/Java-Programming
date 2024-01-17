import java.util.*;

public class CheckPrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check either it's Prime or NOT: ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("The number is prime!");
        }else{
            for(int i = 2; i <= (n - 1) ; i++) {
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
}

//Alternate code for the above:-
// import java.util.*;

// public class CheckPrimeOrNot{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for (int i = 2; i <= (n-1); i++){
//             if((n%i) == 0){
//                 isPrime = false;
//             }
//         }
//         if(isPrime == false){
//             System.out.println("Your entered no. is composite!");
//         }else{
//             System.out.println("Your entered no. is prime!");
//         }
//     }
// }