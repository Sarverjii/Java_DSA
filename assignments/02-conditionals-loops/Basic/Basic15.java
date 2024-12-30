//15. Volume Of Prism

import java.util.Scanner;

public class Basic15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the Prism : ");
        float height = sc.nextFloat();
        System.out.print("Enter the base of the Prism : ");
        float base = sc.nextFloat();
        System.out.print("Enter the length of the Prism : ");
        float length = sc.nextFloat();

        System.out.println("The Volume of the Prism is : "+(height*base*length/2));
    }
}
