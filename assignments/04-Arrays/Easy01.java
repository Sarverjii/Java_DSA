
import java.util.Scanner;
public class Easy01 {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            nums[i] = scanner.nextInt();
        }
        Easy01 easy = new Easy01();
        int[] output = easy.buildArray(nums);
        System.out.print("Output: ");
        for (int i = 0; i < length; i++) {
            System.out.print(output[i] + " ");
        }
        scanner.close();
    }
}