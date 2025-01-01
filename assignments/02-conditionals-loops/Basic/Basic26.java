//26. Addition Of Two Numbers

import java.util.Scanner;

public class Basic26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Number Two : ");
        float num2 = sc.nextFloat();
        System.out.println("The Sum of the 2 Numbers is : " + (num1+num2));
        sc.close();
    }
}
