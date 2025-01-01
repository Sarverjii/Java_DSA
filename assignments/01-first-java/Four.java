//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation you want to do.\n + OR - OR - OR * OR /");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("The Sum is : "+(num1+num2));
                break;
            case '-':
                System.out.println("The Differance is : "+ (num1-num2));
                break;
            case '*':
                System.out.println("The Product is : "+(num1*num2));
                break;
            case '/':
                System.out.println("The Division is : " + num1*1.0/num2*1.0);
                break;
            default:
                System.out.println("Wrong Choice. Exiting...");
                break;
        }
        sc.close();
        
    }
}