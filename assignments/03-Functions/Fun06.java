//6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]

import java.util.Scanner;

public class Fun06 {
    static void circle(float r) {
        float circumference = 2 * 3.14f * r;
        float area = 3.14f * r * r;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        circle(radius);
        sc.close();
    }
}