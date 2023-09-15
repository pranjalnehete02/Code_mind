public class Frequency_of_element {  
    public static void main(String[] args) {  
        int [] arr = new int [] {2, 2, 3, 4, 3, 4, 2};  
        int [] frequency = new int [arr.length];  
        int visited = -1;   // because to not visit the visited element again
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    frequency[j] = visited;  
                }  
            }  
            if(frequency[i] != visited)  
                frequency[i] = count;  
        }  

        System.out.println(" Element/Frequency");    
        for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != visited)  
                System.out.println("    " + arr[i] + "/" + frequency[i]);  
        }  
    }
}  