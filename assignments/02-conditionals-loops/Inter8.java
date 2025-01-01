//8. Calculate Depreciation of Value

import java.util.Scanner;

public class Inter8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Deprication on the Products is According to this Table\nYears Old\tDEPRICATION\nBelow 1 Year\t10%\n1-2 Year\t20%\n2-3 Year\t30%\nAbove 3 Years\t40%\n");
        System.out.print("Enter the MRP of your product : ");
        float price = sc.nextFloat();
        System.out.print("Enter how old is your product : ");
        int years = sc.nextInt();

        if(years<0)
            System.out.println("Inavlid Input");
        else if(years==1)
            System.out.println("Your Deprication is "+(price*0.1)+" and the final MRP is "+(price*0.9));
        else if(years==2)
            System.out.println("Your Deprication is "+(price*0.2)+" and the final MRP is "+(price*0.8));
        else if(years<3)
            System.out.println("Your Deprication is "+(price*0.3)+" and the final MRP is "+(price*0.7));
        else 
            System.out.println("Your Deprication is "+(price*0.4)+" and the final MRP is "+(price*0.6));
        sc.close();
    }
}
