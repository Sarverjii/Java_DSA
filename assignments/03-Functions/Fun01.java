//1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]

import java.util.Scanner;

public class Fun01 {

    static int Max(int num1,int num2, int num3)
    {
        int max = num1;
        if(num2>num1)
        {
            if(num2>num3)
                max = num2;
            else    
                max = num3;
        }
        else if(num3>num1)
            max = num3;


        return max;
    }

    static int Min(int num1,int num2, int num3)
    {
        int min = num1;
        if(num2<num1)
        {
            if(num2<num3)
                min = num2;
            else    
                min = num3;
        }
        else if(num3<num1)
            min = num3;


        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers you want to find the max and min from : ");
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3 : ");
        int num3 = sc.nextInt();
        System.out.println("The maximum Number is " + Max(num1,num2,num3) + " and Minimum Number is " + Min(num1,num2,num3));
        sc.close();
    }
}