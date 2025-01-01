//5. Calculate Distance Between Two Points 

import java.util.Scanner;

public class Inter5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the cordinates of the 1st Point : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();     
        System.out.print("Enter the cordinates of the 2st Point : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();    
        
        System.out.println("The Distance Between the Two Points is " + (Math.sqrt((x2-x1)*(x2-x1) - (y2-y2)*(y2-y1))));
        sc.close();
    }
}
