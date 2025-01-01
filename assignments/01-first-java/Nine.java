//9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for Artmstrong Number : ");
        int number = sc.nextInt();
        int temp = number;
        int temp2 = number;

        int digits = 0;
        while(temp!=0)
        {
            digits++;
            temp = temp/10;
        }

        double sum = 0;
        while (temp2 != 0) {
            int digit = temp2%10;
            sum = sum + Math.pow(digit, digits);
            temp2 = temp2/10;
        }

        if((int)sum==number)
            System.out.println(number + " is an Armstrong Number");
        else    
            System.out.println(number + " is not an Armstrong Number");
        sc.close();
    }
}
