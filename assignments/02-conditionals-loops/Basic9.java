//9. Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Equilateral Triangle");
        float side = sc.nextFloat();
        System.out.println("The perimeter of the Equilateral Triangle is : " + (3*side));
    }
}
