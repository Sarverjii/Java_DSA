//24. Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class Basic24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true)
        {
            System.out.print("Enter a number : ");
            int input = sc.nextInt();
            if(input==0)
                break;
            sum += input;
            
        }
        System.out.println("The sum of all the inputed Numbers is : " + sum);
        sc.close();
    }
}
