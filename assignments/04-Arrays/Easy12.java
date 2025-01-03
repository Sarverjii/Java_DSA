import java.util.Scanner;

public class Easy12 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < gain.length ; i++)
        {
            sum += gain[i];
            if(sum > max)
                max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] gain = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
            gain[i] = scanner.nextInt();
        Easy12 easy12 = new Easy12();
        System.out.println("The largest altitude is: " + easy12.largestAltitude(gain));
        scanner.close();
        
    }
}
