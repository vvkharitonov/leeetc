public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {
        int delta=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0)
            {delta++;
            }
            else{
                nums[i-delta]=nums[i];
            }
        }
        for (int i = nums.length-1; i >= nums.length-delta ; i--) {
            nums[i]=0;
        }

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
