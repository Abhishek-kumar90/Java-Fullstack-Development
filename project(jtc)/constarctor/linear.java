package constarctor;

public class linear {
    public static void main(String args[]){

        int[] arr = {12,23,34,45,56};

        for(int i =0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                int element = arr[j];
                arr[j] = element;
                System.out.println(arr[j]);
                
            }
        }

       
    }
}
