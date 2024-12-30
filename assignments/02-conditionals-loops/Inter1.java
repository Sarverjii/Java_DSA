//1. Factorial Program In Java

import java.util.Scanner;

public class Inter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial of : ");
        int n = sc.nextInt();
        long fact =1;
        for(int i = 1; i<=n; i++)
        {
            fact *= i;
        }
        System.out.println("The Factorial of the number "+n+" is : "+ fact);
    }
}
