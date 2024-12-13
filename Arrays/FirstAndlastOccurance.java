public class FirstAndlastOccurance {
    public static void main(String[] args) {

        int[] arr = {0,1,1,2,2,2,2,2,5};
        int f = -1;
        int l = -1;


        for(int i=0; i< arr.length; i++){
            if(arr[i]==2){
                f = i;
                break;
            }
        }

        System.out.println("First occurance is " + f);

        for(int i=0; i< arr.length; i++){
            if(arr[i]==2){
                l = i;
            }
        }

        System.out.println("last occurance is " + l);
        
    }
}
