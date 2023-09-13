public class print_no_of_ele {
    int elements(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + 1;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,21,23,24,25,36,28,29,57};
        print_no_of_ele p = new print_no_of_ele();
        int sum = p.elements(arr);

        System.out.println("Number of elements in the given array is/are :" +sum);
    }
}
