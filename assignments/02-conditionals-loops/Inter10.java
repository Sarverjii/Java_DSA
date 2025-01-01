//10. Calculate CGPA Java Program

import java.util.Scanner;

public class Inter10 {

    static int GradePoint(int marks)
    {
        if(marks>=90)
            return 10;
        else if(marks>=80)
            return 9;
        else if(marks>=70)
            return 8;
        else if(marks>=60)
            return 7;
        else if(marks>=50)
            return 6;
        else if(marks>=40)
            return 5;
        else if(marks>=30)
            return 4;
        else if(marks>=20)
            return 3;
        else if(marks>=10)
            return 2;
        else if(marks>=10)
            return 1;
        else 
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Courses you took : ");
        int number = sc.nextInt();
        int total = 0;
        int totalcredit = 0;
        for(int i =1; i<=number;i++)
        {
            System.out.print("Enter the Number of Credits the Course was for and the marks obtained in it : ");
            int credit = sc.nextInt();
            int marks = sc.nextInt();
            total += credit * GradePoint(marks);
            totalcredit += credit;
        }
        System.out.println("Your CGPA is : "+(total*1.0/totalcredit*1.0));
        sc.close();
    }
}
