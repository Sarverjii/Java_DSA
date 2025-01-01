//14. [Write a function that returns the sum of first n natural numbers.]

import java.util.Scanner;

public class Fun14 {
    
    static int sumOfFirstNNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");

        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfFirstNNaturalNumbers(n));
        sc.close();
    }
}   
