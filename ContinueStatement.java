public class ContinueStatement {
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\nHowever you can notice that the value '7' is skipped with the help of continue statement!");
    }
}
