public class LogicalOperator {
    public static void main(String args[]){
        System.out.println((3>1) && (5<10));
        System.out.println((3>1) && (5>10));
        //Both statement must be true to print true for Logical AND Operator!
        
        System.out.println((3>1) || (5>10));
        System.out.println((3>1) || (5>10));
        //If any one statement is true then Logical OR Operator will print true!

        System.out.println(!(10>20));
        System.out.println(!(10<20));
        //Logical NOT Operator will interchange the true value to false and vice-versa!
    }    
}
