import java.util.Scanner;

public class Easy07 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int length = nums.length;
        for(int i = 0; i < length-1; i++)
        {
            for(int j = i+1; j < length; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Easy07 easy07 = new Easy07();
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            nums[i] = scanner.nextInt();
        }
        int output = easy07.numIdenticalPairs(nums);
        System.out.println("Output: " + output);
        scanner.close();
        
    }
}
