//7. Area Of Equilateral Triangle

import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of a equilateral Triangle");
        float l = sc.nextFloat();
        System.out.println("Area of the Equilateral Triangle is : " + ((1.732/4)*l*l));    
    }
}
