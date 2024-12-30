//25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Basic25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = 0;
        while (true) {
            System.out.print("Enter a number : ");
            int input = sc.nextInt();
            if(input>high)
                high = input;
            if(input == 0)
                break;
        }
        System.out.println("The Biggest number of all the numbers was : " + high);
    }
}
