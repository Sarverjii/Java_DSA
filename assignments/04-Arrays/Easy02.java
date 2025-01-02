import java.util.Scanner;

public class Easy02 {

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] output = new int[length * 2];
        for (int i = 0; i < length; i++) {
            output[i] = nums[i];
            output[i + length] = nums[i];
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            nums[i] = scanner.nextInt();
        }
        Easy02 easy02 = new Easy02();
        int[] output = easy02.getConcatenation(nums);
        System.out.println("The concatenated array is: ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        scanner.close();
    }
}
