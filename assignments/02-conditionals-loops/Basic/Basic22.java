import java.util.Scanner;

public class Basic22 {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        while(n!=0)
        {
            int digit = n%10;
            sum += digit;
            prod *= digit;
            n /= 10; 
        }

        System.out.println("The Difference Between the Product and sum of digits is : "+(prod-sum));
    }
}
