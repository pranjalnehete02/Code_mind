public class sort_array {
    void sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int pointer = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[pointer]){
                    pointer = j;
                }
            }
            int temp = arr[pointer];
            arr[pointer] = arr[i];
            arr[i] = temp;
        }

        System.out.println("The given sorted elements are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr = {0, 23, 14, 12, 9};

        sort_array s = new sort_array();
        s.sort(arr);
    } 
}
