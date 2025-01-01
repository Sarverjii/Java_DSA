//22. Perfect Number In Java

import java.util.Scanner;

public class Inter22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for perfect Number : ");
        int number = sc.nextInt();
        if(number<=0)
        {
            System.out.println("Entered number is less than zero or equal to zero, Invalid Entry");
            System.exit(1);
        }
        int sum = 0;
        for(int i = 1; i < number; i++)
        {
            if(number%i == 0)
                sum += i;
        }
        if(sum == number)
            System.out.println("Entered Number is a perfect number.");
        else    
            System.out.println("Entered number is not a perfect number");
        sc.close();
    }
}
