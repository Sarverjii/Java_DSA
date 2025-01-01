//3. [A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote.]

import java.util.Scanner;

public class Fun03 {
    static String Vote_or_Not(int age)
    {
        if(age>=18)
            return "Eligible";
        else
            return "Not Eligible";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.println("You are " + Vote_or_Not(age) + " to Vote.");
    }
}
