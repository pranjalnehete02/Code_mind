import java.util.Scanner;
public class positive_negative {

    void check(int a){
        if(a > 0)
            System.out.println("Entered numver is positive");
        else if(a < 0)
            System.out.println("Entered numver is negative");
        else{
            System.out.println("The number is zero(0)");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int a = sc.nextInt();

        positive_negative c = new positive_negative();
        c.check(a);


    }

}
