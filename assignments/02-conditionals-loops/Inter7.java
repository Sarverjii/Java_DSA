//7. Power In Java

import java.util.Scanner;

public class Inter7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter the number you want to find the Power of : ");
        float num = sc.nextInt();
        System.out.print("Enter the power that you want to Calculate : ");
        int power = sc.nextInt();

        System.out.println("The power of the number using Math.pow is : "+ Math.pow(num,power));
        int prod = 1;
        for(int i = 1; i<=power;i++)
        {
            prod *=num;   
        }
        System.out.println("The power of the number using LooP is : "+prod);
    }
}
