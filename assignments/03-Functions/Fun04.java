//4. [Write a program to print the sum of two numbers entered by user by defining your own method.]

import java.util.Scanner;

public class Fun04 {
    
    static int SUM(int num1, int num2)
    {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find Sum of 2 Numbers");
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Sum of these 2 numbers is : "+ SUM(num1, num2));    
        sc.close();
    }    
}
