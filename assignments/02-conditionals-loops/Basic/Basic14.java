//14. Volume Of Cone Java Program

import java.util.Scanner;

public class Basic14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the Cone : ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the Cone : ");
        float h = sc.nextFloat();
        System.out.println("The Volume of the cone is : " + (3.14*r*r*h/3));
        sc.close();
    }
}
