import java.util.Scanner;

public class Greater {

    int Greatest_num(int a, int b, int c){
        if(a>b & a>c)
            return a;
        else if(b>a & b>c)
            return b;
        else
            return c;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third Number : ");
        int c = sc.nextInt();

        Greater Greatest_num = new Greater();
        int Greatest = Greatest_num.Greatest_num(a, b, c);
        System.out.println("The greatest number among a,b,c is "+Greatest); 
    }

}
