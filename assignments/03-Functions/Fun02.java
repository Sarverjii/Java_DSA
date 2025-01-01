//2. [Define a program to find out whether a given number is even or odd.]

import java.util.Scanner;

public class Fun02 {

    static String Even0rOdd(int num)
    {
        if(num%2==0)
            return "Even";
        else
            return "Odd";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for Even or Odd : ");
        int num = sc.nextInt();
        System.out.println("The Entered Number is " + Even0rOdd(num));
        sc.close();
    }
}
