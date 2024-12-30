//3. Area Of Rectangle Program 

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        float l = sc.nextFloat();
        System.out.print("Enter the breath of the Rectangle : ");
        float b = sc.nextFloat();
        System.out.println("Area of the rectangle is : "+l*b);
    }
}
