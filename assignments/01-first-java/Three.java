//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Principal amount");
        int P = sc.nextInt();
        System.out.println("Please Enter the Time Period in months");
        int T = sc.nextInt();
        System.out.println("Please Enter the Rate of interest");
        int R = sc.nextInt();

        float SI = P*R*T/100;
        System.out.println("The Calculated Simple Interest is : "+SI);
        sc.close();
    }
}
