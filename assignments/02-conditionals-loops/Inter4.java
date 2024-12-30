//4. Calculate Discount Of Product

import java.util.Scanner;

public class Inter4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Discount on the Products is According to this Table\nMRP\t\tDISCOUNT\nBelow 1000\t10%\n1001-2000\t20%\n2001-3000\t30%\nAbove 3000\t40%\n");
        System.out.print("Enter the MRP of your product : ");
        float price = sc.nextFloat();

        if(price<0.0)
            System.out.println("Inavlid Input");
        else if(price<1000.001)
            System.out.println("Your Discount is "+(price*0.1)+" and the final MRP is "+(price*0.9));
        else if(price<2000.001)
            System.out.println("Your Discount is "+(price*0.2)+" and the final MRP is "+(price*0.8));
        else if(price<3000.001)
            System.out.println("Your Discount is "+(price*0.3)+" and the final MRP is "+(price*0.7));
        else 
            System.out.println("Your Discount is "+(price*0.4)+" and the final MRP is "+(price*0.6));
    }
}
