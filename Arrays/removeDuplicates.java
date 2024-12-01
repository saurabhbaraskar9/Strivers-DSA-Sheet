public class removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        int j =1;
        for(int i=1; i<nums.length; i++){
                    if(nums[i] != nums[i-1] ){
                     System.out.println(nums[j]);
                     j++;   
                    }             
    }

    return j;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,6,6,7,7,9};
        removeDuplicates(nums);
    }
}
