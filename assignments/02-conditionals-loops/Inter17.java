//17. Find if a number is palindrome or not 

import java.util.Scanner;

public class Inter17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for palindrome : ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;

        while(temp>0)
        {
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }
        if (reverse == n) {
            System.out.println("The Entered Number is Palindrome");
        }
        else
            System.out.println("The Entered Number is not a palindrome");
        sc.close();
    }
}
