import java.util.Scanner;
public class lower_uppercase_check {
        void  check(char c){
            if(c >= 'a' & c <='z')
                System.out.println("lowercase");
            else if(c >= 'A' & c <= 'Z')
                System.out.println("UPPERCASE");
            else{
                System.out.println("Enter correct choice");
            }
        }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:  ");
        char c = scanner.next().charAt(0);
    
        lower_uppercase_check a = new lower_uppercase_check();
        a.check(c);
    }
    }

