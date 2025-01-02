import java.util.Scanner;

public class Easy08 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] count = new int[101];
        count[0] = 0;
        for(int i = 0; i < length; i++)
        {
            count[nums[i]]++;
        }

        for(int i = 1; i<100;i++)
        {
            count[i] = count[i]+count[i-1];
        }

        for(int i = 0; i < length; i++)
        {
            if(nums[i]==0)
                result[i] = 0;
            else
                result[i] = count[nums[i]-1];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Easy08 obj = new Easy08();
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            nums[i] = scanner.nextInt();
        }
        int[] result = obj.smallerNumbersThanCurrent(nums);
        System.out.println("The result is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(result[i] + " ");
        }
        scanner.close();
        
    }
    
}
