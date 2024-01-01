import java.util.*;

public class Bill3Item {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost of Pencil: ");
        float pencil = input.nextFloat();

        System.out.print("Enter the cost of Pen: ");
        float pen = input.nextFloat();

        System.out.print("Enter the cost of Eraser: ");
        float eraser = input.nextFloat();

        float TotalCost = pencil + pen + eraser;

        System.out.println("The bill of your items without GST is: "+ TotalCost);

        float GST = (TotalCost) * (0.18f);

        float BillWithGST = TotalCost + GST;

        System.out.println("The bill of your items with GST is: "+ BillWithGST);
    }
}
