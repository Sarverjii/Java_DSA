//4. Area Of Isosceles Triangle 

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Equal Sides : ");
        float a = sc.nextFloat();
        System.out.print("Enter the length of the base : ");
        float b = sc.nextFloat();
        double area = (b/2) * Math.sqrt(((a*a) - (b*b/4)));
        System.out.println("Area of the Isosceles Triangle is : "+area); 
    }
}
