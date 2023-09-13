import java.util.Scanner;
public class Alternate_element {

    void alter(int arr[], int size){
        System.out.println("The alternate elements are : ");
        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                System.out.println(arr[i] + " ");
        }
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[50];
    System.out.println("Enter the "+size+" elements : ");
    for(int i = 0; i <= size; i++){
        arr[i] = sc.nextInt();
    }

    Alternate_element alt = new Alternate_element();
    alt.alter(arr, size);
                                    }
}