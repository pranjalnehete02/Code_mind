import java.util.Scanner;

public class smallest {
    int small(int arr[], int size){
        int value = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] < value){
                value = arr[i];
            }
        }
        return value;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[50];
        System.out.println("Enter the "+size+" array elements :");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        smallest n = new smallest();
        int value = n.small(arr, size);
        System.out.println("The smallest number is :" +value );
    }
}
