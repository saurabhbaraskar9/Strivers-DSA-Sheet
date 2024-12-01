

public class moveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int j =0; 

        for (int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        for(int i=j; i<nums.length; i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,3,0,5,6,8,7};
        moveZeroes(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
