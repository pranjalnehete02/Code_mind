import java.util.Scanner;

import java.util.Scanner;
public class duplicate {
    void duplicate_ele(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" elements of array");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        duplicate d = new duplicate();
        System.out.print("The duplicate numbers are : ");
        d.duplicate_ele(arr);
    }
}
