import java.util.Scanner;
public class sum_of_elements{
    int sum(int arr[], int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = arr[i] + sum;
        }
        return sum;
    }

    int array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size+" elements");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return sum(arr, size);
    }

    public static void main(String[] args){
        sum_of_elements s = new sum_of_elements();
        int value = s.array();
        System.out.println("Sum of the elements is  : " +value);
    }
}