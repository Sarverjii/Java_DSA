//2. Calculate Electricity Bill

import java.util.Scanner;

public class Inter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Units used : ");
        float units = sc.nextFloat();
        System.out.println("\nElectricity Bill is calculated as follows : \n\n0 - 100 units\t5 Rupee\n101-150 units\t6rupee\n151-200 units\t6rupee\nAbove 200\t8 Rupee\n");
        if(units<0.0)
            System.out.println("Invalid Input");
        else if(units<100.001)
            System.out.println("Your Bill is : " + (units*5));
        else if(units<150.001)
            System.out.println("Your Bill Is : " + (500 + (units-100.0)*6));
        else if(units<200.001)
            System.out.println("Your Bill Is : " + (800 + (units-150.0)*7));
        else
            System.out.println("Your Bill Is : " + (1150 + (units-200.0)*8));
        sc.close();
    }
}
