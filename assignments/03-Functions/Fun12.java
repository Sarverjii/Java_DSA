//12. [Write a function to check if a given triplet is a Pythagorean triplet or not.]

import java.util.Scanner;

public class Fun12 {
    
    static boolean isPythagoreanTriplet(int a, int b, int c) {

        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Side : ");
        int a = sc.nextInt();
        System.out.print("Enter the second Side : ");
        int b = sc.nextInt();
        System.out.print("Enter the third Side : ");
        int c = sc.nextInt();
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println(a + ", " + b + ", " + c + " is a Pythagorean triplet");
        } else {
            System.out.println(a + ", " + b + ", " + c + " is not a Pythagorean triplet");
        }
        sc.close();
    }

}
