//5. [Define a method that returns the product of two numbers entered by user.]

import java.util.Scanner;

public class Fun05 {
    static int Prod(int num1, int num2)
    {
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find Product of 2 Numbers");
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("The Product of these 2 numbers is : "+ Prod(num1, num2));
        sc.close();
    }
}
