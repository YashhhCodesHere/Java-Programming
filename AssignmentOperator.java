public class AssignmentOperator {
    public static void main(String args[]){
        int a = 35;
        System.out.println(a);
        a += 15;
        System.out.println(a);
        a -= 20;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 5;
        System.out.println(a);

        // (a = a + 15) & (a += 15): Both are same!
    }
}
