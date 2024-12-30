//9. Calculate Batting Average

import java.util.Scanner;

public class Inter9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of wickets fallen : ");
        int wickets = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= (wickets+2); i++)
        {
            System.out.print("Enter the Score of the Batter Number "+i+" : ");
            sum += sc.nextInt();
        }
        System.out.println("The Average Batting Score is : " + (sum/(wickets+2)));
    }
}
