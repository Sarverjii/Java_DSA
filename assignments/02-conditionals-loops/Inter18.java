//18. Future Investment Value

import java.util.Scanner;

public class Inter18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Investment Increases According to this Table\nTime\t\t% Increase \nBelow 1 Year\t10%\n1 Year - 2 Year\t20%\n2 Year-3 Year\t30%\nAbove 3 Year\t40%\n");
        System.out.print("Enter the Initial Investment Value : ");
        float price = sc.nextFloat();

            System.out.println("Your Future Investment Value after 1 Year "+((price*0.1)+price));
            System.out.println("Your Future Investment Value after 2 Years "+((price*0.2)+price));
            System.out.println("Your Future Investment Value after 3 Years "+((price*0.3)+price));
            System.out.println("Your Future Investment Value aftre 4 Years "+((price*0.4)+price));
    }
}
