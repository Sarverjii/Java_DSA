import java.util.Scanner;

public class Easy05 {
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[2*n];
        for(int i = 0; i < n ; i++)
        {
            output[2*i] = nums[i];
            output[2*i+1] = nums[i+n];
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Easy05 easy05 = new Easy05();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter the values of the array: ");
        for(int i = 0; i < 2*n; i++)
        {
            nums[i] = scanner.nextInt();
        }
        int[] output = easy05.shuffle(nums, n);
        for(int i = 0; i < 2*n; i++)
        {
            System.out.println(output[i]);
        }
        scanner.close();

    }
}
