//1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class One{
    public static void main(String[] args){
        System.err.println("Enter a number you want to check for Even or Odd");   
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");        
    }
}