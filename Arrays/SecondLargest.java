public class SecondLargest {

    static int print2largest(int arr[], int n) {
           
        int max = arr[0];
        int sm = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                sm=max;
                max=arr[i];
            }
            
             if (arr[i]< max && arr[i]>sm){
                sm=arr[i];
            }
        }
        
        return sm;
    }

   
    public static void main(String[] args) {
    int[] arr = {1, 3, 2, 5, 7, 6};
   System.out.println(print2largest(arr,6));
}

}