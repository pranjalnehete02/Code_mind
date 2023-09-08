import java.util.Scanner;

public class Switch_case {

    void vowel(char ch){
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered character is a vowel");
                break;
        
            default:
                System.out.println("Entered character is not a vowel");
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        Switch_case x = new Switch_case();
        x.vowel(ch);
    }

}
