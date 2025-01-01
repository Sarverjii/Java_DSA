//19. Curved Surface Area Of Cylinder

import java.util.Scanner;

public class Basic19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Cylinder");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the Cylinder");
        float h = sc.nextFloat();

        System.out.println("The Curved Surface Area of the Cylinder is : " + (2 * 3.14 * r * h));
        sc.close();
    }
}