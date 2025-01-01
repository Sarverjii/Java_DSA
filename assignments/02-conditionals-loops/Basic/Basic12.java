//12. Perimeter Of Square

import java.util.Scanner;

public class Basic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square");
        float side = sc.nextFloat();
        System.out.println("The Perimeter of the Sqaure is : " + 4*side);
        sc.close();
    }
}
