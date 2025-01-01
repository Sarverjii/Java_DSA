//24. Sum Of A Digits Of Number

import java.util.Scanner;

public class Inter24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int sum = 0;
        while(number>0)
        {
            sum += number%10;
            number /= 10;
        }
        System.out.println("Sum of the Digits of the Number is : " + sum);
        sc.close();
    }  
}
