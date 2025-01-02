import java.util.ArrayList;

public class Easy09 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            output.add(index[i],nums[i]);
        }
        int size = output.size();
        int[] output_array = new int[nums.length];
        for(int i = 0; i < size; i++)
        {
            output_array[i] = output.get(i);
        }
        return output_array;
    }
    public static void main(String[] args) {
        Easy09 obj = new Easy09();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = obj.createTargetArray(nums, index);
        System.out.println("The result is: ");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }    
}
