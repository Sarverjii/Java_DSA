import java.util.Scanner;

public class Easy10 {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        for(int i = 0; i < sentence.length(); i++)
        {
            count[(int)(sentence.charAt(i)) - 97]++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(count[i] == 0)
                return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();
        Easy10 easy10 = new Easy10();
        System.out.println(easy10.checkIfPangram(sentence));
        scanner.close();
    }
}
/*
 * A Much Better Solution Seen on Leetcode
 * class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
}
 */