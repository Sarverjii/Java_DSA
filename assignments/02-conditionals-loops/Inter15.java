//15. Find Ncr & Npr

import java.util.Scanner;

public class Inter15 {

    static int Factorial(int n)
    {
        int prod = 1;
        for(int i = 1; i <= n; i++)
        {
            prod *= i;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Find nCr and nPr");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        double nPr = Factorial(n) / Factorial(n-r);
        double nCr = Factorial(n) / (Factorial(n-r)*Factorial(r)*1.0);
        System.out.println("The Value of nCr = " + nCr + "\nThe Value of cPr = " + nPr);
        sc.close();
    }
}
