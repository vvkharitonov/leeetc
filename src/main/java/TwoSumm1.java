public class TwoSumm1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] out = {0,0};
        for (int i = 0; i <nums.length -1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target) {
                    out[0]=i;
                    out[1]=j;
                    return out;
                }
            }
        }
        return out;
    }


    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;

        System.out.println(twoSum(nums,target)[0]+" "+twoSum(nums,target)[1]);
    }
}
