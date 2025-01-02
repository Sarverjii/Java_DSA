import java.util.Scanner;

public class Easy04 {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];
        output[0] = nums[0];
        for(int i = 1; i < length; i++)
        {
            output[i] = nums[i] + output[i-1];
        }
        return output;
    }
    public static void main(String[] args) {
        Easy04 easy04 = new Easy04();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = scanner.nextInt();
        }
        int[] output = easy04.runningSum(nums);
        for(int i = 0; i < output.length; i++)
        {
            System.out.println(output[i]);
        }
        scanner.close();
    }
}
