//20. Total Surface Area Of Cube

import java.util.Scanner;

public class Basic20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Cube : ");
        float side = sc.nextFloat();
        System.out.println("Total Surface Area of Cube is : " + (6 * side * side));
    }
}
