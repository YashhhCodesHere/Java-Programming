public class Functions {
    //We must have to add return whenever it's return type is other than void!
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    public static void main(String args[]) {
        System.out.println("Now we're going to print Hello World 5 times by calling a function...\n");
        printHelloWorld();
    }
}
