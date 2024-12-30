//1. Area Of Circle Java Program

import java.util.Scanner;

public class Basic1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        float r = sc.nextFloat();
        System.out.println("The area of the Circle is : "+ 3.14*r*r);
    }
}