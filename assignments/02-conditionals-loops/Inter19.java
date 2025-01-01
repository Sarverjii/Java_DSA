//19. HCF Of Two Numbers Program

import java.util.Scanner;

public class Inter19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + a);
        sc.close();
    }
}    
