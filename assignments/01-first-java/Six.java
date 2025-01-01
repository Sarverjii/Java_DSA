//6. Input currency in rupees and output in USD.
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currecncy in rupees");
        float money = sc.nextFloat();
        System.out.println(money + " rupees in USD are " + (money *80));
        sc.close();
    }
}
