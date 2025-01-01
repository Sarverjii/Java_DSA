//23. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Basic23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to find all the factors for : ");
        int number = sc.nextInt();
        System.out.print("The list of Factors is : ");
        for(int i = 1 ; i <=number;i++)
        {
            if(number%i==0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
