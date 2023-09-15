import java.util.Scanner;
public class even_odd {
    int even(int arr[]){
        int remainder = 0;
        for(int i : arr){
            if(i % 2 == 0){
                remainder++;
            }
        }
        return remainder;
    }

    int odd(int arr[]){
        int remainder = 0; 
        for(int i : arr){
            if(i % 2 != 0){
                remainder++;
            }
        }
        return remainder;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" elements of array");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        even_odd e = new even_odd();
        System.out.println("The even numbers are "+e.even(arr)+ " and the odd numbers are "+e.odd(arr));
    }
}
