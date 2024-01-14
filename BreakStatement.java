public class BreakStatement {
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            if (i == 6) {
                break;
            }
            System.out.println("Hello World!");
        }
        System.out.println("\nNow I'm out from the for loop as the value of i got equals to 6!");
    }
}
