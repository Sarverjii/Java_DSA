//8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check for palindrome.");
        String input = sc.nextLine();
        int len = input.length();
        boolean isPalindrome = true;
        for(int i = 0; i < len; i++)
        {
            if(input.charAt(i)!=input.charAt(len-1-i))
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("The Given String : "+input+" is a palindrome");
        else    
            System.out.println("The Given String : "+input+" is not a palindrome");
    }
}
