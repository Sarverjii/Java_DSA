//18. Volume Of Pyramid

import java.util.Scanner;

public class Basic18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the base of the Pyramid : ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the pyramid : ");
        float height = sc.nextFloat();
        System.out.println("The Volume of the Pyramid is : " + (base * height /3));
        sc.close();
    }
}
