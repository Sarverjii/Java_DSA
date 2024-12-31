//16. Reverse A String In Java

import java.util.Scanner;

public class Inter16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want to reverse : ");
        String s = sc.nextLine();
        int len = s.length();
        String reveString = "";
        for (int i = len-1; i >=0; i--)
        {
            reveString += s.charAt(i);
        }
        System.out.println("The reversed String is : " + reveString);
    }
}
