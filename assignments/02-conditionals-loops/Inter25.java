//25. Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class Inter25 {
    public static void main(String[] args) {
        int number_of_days_august = 31;
        int number_of_days_out = 0;
        for(int i = 1; i<= number_of_days_august ; i++)
        {
            if(i%2==0)
                number_of_days_out++;
        }      
        System.out.println("Kunal can go out " + number_of_days_out + " number of days in august");
    }
}
