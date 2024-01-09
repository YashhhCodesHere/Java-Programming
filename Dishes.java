import java.util.*;

public class Dishes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("We Deliver:- \n 1. Biriyani,\n 2. Burger,\n 3. Samosa,\n 4. Cake,\n 5. Chole Bhature.");
        System.out.print("Enter the Dish you want form our restraunt: ");
        String Dishes = sc.nextLine();
        switch(Dishes) {
            case "Biriyani" : System.out.println("Your order Biriyani is ready!");
            break;
            case "Burger" : System.out.println("Your order Burger is ready!");
            break;
            case "Samosa" : System.out.println("Your order Samosa is ready!");
            break;
            case "Cake" : System.out.println("Your order Cake is ready!");
            break;
            case "Chole Bhature" : System.out.println("Your order Chole Bhature is ready!");
            break;
            default : System.out.println("You ordered the dish which is not available in our restaurant right now!\n We really apologise for this!");
        }
    }
}
