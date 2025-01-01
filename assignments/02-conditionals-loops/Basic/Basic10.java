//10. Perimeter Of Parallelogram

import java.util.Scanner;

public class Basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the parallelogram");
        float l = sc.nextFloat();
        System.out.print("Enter the breath of the Parallelogram");
        float b = sc.nextFloat();

        System.out.println("The Perimeter of the Parallelogram is : " +(l+l+b+b));
        sc.close();
    }
}
