import java.util.Scanner;


public class Reminder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the divident:  ");
        int divident = sc.nextInt();
        System.out.println("Enter the divisior:  ");
        int divisior = sc.nextInt();

        int quotient = divident/divisior;
        int remainder = divident%divisior;

        System.out.println("Quotient is :  "+quotient);
        System.out.println("Remainder is :  "+remainder);
    }
    
}
