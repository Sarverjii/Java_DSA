//12. Calculate Average Marks

import java.util.Scanner;

public class Inter12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.print("Enter the marks of the subject number " + i + " : ");
            sum += sc.nextInt();
        }
        System.out.println("The Average Score is : "+(sum/n));
        sc.close();
    }
}
