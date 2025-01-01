//21. Java Program Vowel Or Consonant 

import java.util.Scanner;

public class Inter21 {
    public static void main(String[] args) {
        System.out.print("Enter the character you want to find if it is Vowel or Constonent : ");
        Scanner sc = new Scanner(System.in);
        char letter = sc.nextLine().charAt(0);
        if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
            System.out.println("Entered Character is a Vowel.");
        else 
            System.out.println("Entered character is a consonant.");
        sc.close();
    }
}
