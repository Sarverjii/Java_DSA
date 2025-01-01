//12. Perimeter Of Rhombus

import java.util.Scanner;

public class Basic13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Rhombus");
        float side = sc.nextFloat();
        System.out.println("The Perimeter of the Rhombus is : " + 4*side);
        sc.close();
    }
}
