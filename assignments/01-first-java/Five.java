//5. Take 2 numbers as input and print the largest number.


import java.util.Scanner;

public class Five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();

        if(num1>num2)
            System.out.println(num1 + " Is greater than " + num2);
        else if(num2>num1)
            System.out.println(num2 + " Is greater than "+ num1);
        else
            System.out.println("Both numbers are equal");
        sc.close();
    }
}