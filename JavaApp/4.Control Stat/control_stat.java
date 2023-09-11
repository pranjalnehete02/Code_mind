import java.util.Scanner;
public class control_stat {

    void Greater(int x, int y){
        if(x>y)
            System.out.println(x+" is the greater number");
        else    
            System.out.println(y+" is the greater number");
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:  ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        control_stat num = new control_stat();
        num.Greater(x,y);

    }
    
}
