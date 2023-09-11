import java.util.Scanner;
public class School_Grade {
  
    void  Grade(int grade){
        if(25>grade)
            System.out.println("You got F Grade");
        else if(25 <= grade & 45 > grade)
            System.out.println("You got E Grade");
        else if(45 <= grade & 50 > grade)
            System.out.println("You got D Grade");
        else if(50 <= grade & 60 > grade)
            System.out.println("You got C Grade");
        else if(60 <= grade & 80 > grade)
            System.out.println("You got B Grade");  
        else if(80 <= grade)
            System.out.println("You got A Grade");
        else{
            System.out.println("Enter correct choice");
        }
    }

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your Marks:  ");
    int grade = scanner.nextInt();

    School_Grade s = new School_Grade();
    s.Grade(grade);
}
}
