import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy06 {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1; i < candies.length ; i++)
        {
            if(candies[i]>max){
                max = candies[i];}
            
        }
        ArrayList<Boolean> output = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++)
        {
            if((candies[i] + extraCandies) >= max)
                output.add(true);
            else
                output.add(false);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Easy06 easy06 = new Easy06();
        System.out.println("Enter the number of kids: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the number of candies each kid has: ");
        for(int i = 0; i < n; i++)
        {
            candies[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of extra candies: ");
        int extraCandies = scanner.nextInt();
        List<Boolean> output = easy06.kidsWithCandies(candies, extraCandies);
        System.out.println("Output: " + output.toString());
        scanner.close();
    }
}
