import java.util.Scanner;
import java.util.Arrays;

public class Easy03 {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];
        output[0] = nums[0];
        for (int i = 1; i < length; i++) {
            output[i] = nums[i] + output[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter interger for index number " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        Easy03 easy03 = new Easy03();
        System.out.println("The New Array is : " + Arrays.toString(easy03.runningSum(nums)));
        scanner.close();
    }
}
