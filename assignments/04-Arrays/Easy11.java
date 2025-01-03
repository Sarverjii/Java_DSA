import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy11 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int RuleKey;
        if(ruleKey.equals("type"))
            RuleKey = 0;
        else if(ruleKey.equals("color"))
            RuleKey = 1;
        else
            RuleKey = 2;

        for(int i = 0; i < items.size(); i++)
        {
            if(items.get(i).get(RuleKey).equals(ruleValue))
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        List<List<String>> items = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            List<String> item = new ArrayList<>();
            System.out.println("Enter the type, color and name of item " + (i + 1) + ": ");
            item.add(scanner.next());
            item.add(scanner.next());
            item.add(scanner.next());
            items.add(item);
        }
        System.out.println("Enter the rule key: ");
        String ruleKey = scanner.next();
        System.out.println("Enter the rule value: ");
        String ruleValue = scanner.next();
        Easy11 easy11 = new Easy11();
        System.out.println(easy11.countMatches(items, ruleKey, ruleValue));
        scanner.close();
        
    }
}
