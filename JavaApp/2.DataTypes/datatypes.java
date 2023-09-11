import java.util.Scanner;
class datatypes {

//Define the data types
byte myNum = 9;
float myFloatNum = 8.99f;
char myLetter = 'A';
boolean myBool = false;
String myText = "Hello World";

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        
        //Read two intergers from user and return the addition 
        int a, b;
        System.out.println("Enter the two int type numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int result = a + b;
        System.out.println("The addition of "+a+" and " +b+ " is " +result );


         //Read two intergers from user and return the substraction
         float c, d;
         System.out.println("Enter the two float numbers: ");
         c = sc.nextFloat();
         d = sc.nextFloat();
         float result1 = c - d;
         System.out.println("The substraction of "+c+" and " +d+ " is " +result1 );

        //Read two intergers from user and return the multiplication
         int e, f;
         System.out.println("Enter the two numbers: ");
         e = sc.nextInt();
         f = sc.nextInt();
         int result2 = e * f;
         System.out.println("The multiplication of "+e+" and " +f+ " is " +result2 );


        //Read two intergers from user and return the division
         int g, h;
         System.out.println("Enter the two numbers: ");
         g = sc.nextInt();
         h = sc.nextInt();
         float result3 = g / h;
         System.out.println("The addition of "+g+" and " +h+ " is " +result3 );

    }


    
}
