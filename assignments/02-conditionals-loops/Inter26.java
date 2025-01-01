//26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of 
//positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Inter26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg_sum = 0;
        int pos_even_sum = 0;
        int pos_odd_sum = 0;
        while(true)
        {   
            System.out.print("Enter a Number : ");
            int number = sc.nextInt();

            if(number == 0)
                break;
            else if(number<0)
                neg_sum += number;
            else
            {
                if(number%2==0)
                    pos_even_sum+=number;
                else
                    pos_odd_sum+=number;
            }
        }
        System.out.println("The Sum of Negative Numbers is : " +neg_sum);
        System.out.println("The sum of Postivie Even Numbers is : "+pos_even_sum);
        System.out.println("The Sum of Positive Odd Numbers is : " + pos_odd_sum);
    }
}
