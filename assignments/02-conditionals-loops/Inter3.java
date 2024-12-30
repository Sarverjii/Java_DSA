//3. Calculate Average Of N Numbers

import java.util.Scanner;

public class Inter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want to find the average of : ");
        int numbers = sc.nextInt();
        float sum = 0;
        System.out.println("Now enter the numbers you want to find the Average of");
        for(int i = 1; i <= numbers ; i++)
        {
            sum += sc.nextFloat(); 
        }

        System.out.println("The Average is : " +(sum*1.0/numbers * 1.0));
    }
}
