//16. Volume Of Cylinder

import java.util.Scanner;

public class Basic16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Cylinder");
        float r = sc.nextFloat();
        System.out.print("Enter the height of the Cylinder");
        float h = sc.nextFloat();

        System.out.println("The Volume of the Cylinder is : " + (3.14 * r * r * h));
        sc.close();
    }
}
