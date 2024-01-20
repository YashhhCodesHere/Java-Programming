public class SwappingByFunction {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
    }
    public static void main(String args[]) {
        int a = 50;
        int b = 100;
        swap(a, b);
        a = 150;
        b = 200;
        swap(a, b);
    }
}
