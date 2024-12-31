//11. Compound Interest Java Program


import java.util.Scanner;

public class Inter11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle Amount : ");
        int P = sc.nextInt();
        System.out.print("Enter the Rate of Interest : ");
        int R = sc.nextInt();
        System.out.print("Enter the Time Period : ");
        int T = sc.nextInt();
        double CI = P * Math.pow((1 + R/100.0), (T*12));
        System.out.println("The Principle Calculated in "+(T*12)+" Months is : "+ CI);
    }
}
