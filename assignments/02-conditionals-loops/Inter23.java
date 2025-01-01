//23. Check Leap Year Or Not

import java.util.Scanner;

public class Inter23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year you want to check for Leap Year : ");
        int year = sc.nextInt();

        if(year%400==0)
            System.out.println("Enter Year is a leap Year");
        else
        {
            if(year%100 == 0)
                System.out.println("Enter year is not a leap Year");
            else{
                if(year%4==0)
                    System.out.println("Entered Year is a Leap Year");
                else
                    System.out.println("Entered Year is not a leap year");
            } 
        }
        sc.close();
    }    
}
