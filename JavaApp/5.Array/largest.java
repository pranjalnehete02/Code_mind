import java.util.Scanner;
public class largest {
    int large(int arr[], int size){
        int value = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] > value){
                value = arr[i];
            }
        }
    return value;
    }
    


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array:  ");
    int size = sc.nextInt();
    int[] arr = new int[50];
    System.out.println("Enter the "+size+" elements of array :");
    for(int i = 0; i < size; i++){
        arr[i] = sc.nextInt();
    }

    largest l = new largest();
    int value = l.large(arr, size);
    System.out.println("Largest element in the array is " +value);
}


}