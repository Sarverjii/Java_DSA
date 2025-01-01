//21. Fibonacci Series In Java Programs
import java.util.Scanner;
public class Basic21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;

        int temp;

        System.out.print("Enter the number length of sequence you want : ");
        int n = sc.nextInt();

        if(n==1)
            System.out.println("Fibonacci Series of lenght 1 : 0");
        else if(n==2)
            System.out.println("Fibonacci Series of length 2 : 0 1 ");
        else if(n>2)
        {   System.out.print("Fibonacci Series of length 2 : \n0 1 ");

            for(int i = 2; i<n;i++)
            {
                temp = num1+ num2;
                System.out.print(temp + " ");
                num1 = num2;
                num2 = temp;
            }
        }
        else
            System.out.println("Invalid Input");
        sc.close();
    }
}
