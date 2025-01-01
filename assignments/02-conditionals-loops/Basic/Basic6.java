//6. Area Of Rhombus

import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal : ");
        float d1 = sc.nextFloat();
        System.out.print("Enter the length of the second diagonal : ");
        float d2 = sc.nextFloat();
        System.out.println("The area of the rombus is = " + (d1*d2/2));
        sc.close();
    }
}
