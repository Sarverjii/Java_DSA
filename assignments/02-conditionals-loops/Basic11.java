//11. Perimeter Of Rectangle

import java.util.Scanner;

public class Basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the breath of the Rectangle : ");
        float breath = sc.nextFloat();

        System.out.println("The Perimeter of the Rectangle is : " + (2*(length+breath)));
    }

}
