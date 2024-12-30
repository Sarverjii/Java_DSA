//2. Area Of Triangle

import java.util.Scanner;

public class Basic2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1 of the Triangle : ");
        float a = sc.nextFloat();
        System.out.print("Enter the length of side 2 of the Triangle : ");
        float b = sc.nextFloat();
        System.out.print("Enter the length of side 3 of the Triangle : ");
        float c = sc.nextFloat();
        float s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("The area of the Circle is : " + area);
    }
    }