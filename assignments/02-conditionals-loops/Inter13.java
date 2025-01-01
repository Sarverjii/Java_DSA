//13. Sum Of N Numbers

import java.util.Scanner;

public class Inter13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total number of Numbers you want to find the sum of : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<= n; i++)
        {
            System.out.print("Enter the number : ");
            sum += sc.nextInt();
        }
        System.out.println("The Sum of all the numbers is : " + sum);
        sc.close();
    }
}
