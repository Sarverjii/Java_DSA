//9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]

import java.util.Scanner;

public class Fun09 {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}