//17. Volume Of Sphere

import java.util.Scanner;

public class Basic17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere : ");
        float r = sc.nextFloat();
        System.out.println("The Volume of the Sphere is : " + (3.14 * r * r * r));

    }
}