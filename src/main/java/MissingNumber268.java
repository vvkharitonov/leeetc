public class MissingNumber268 {
    public static int missingNumber(int[] nums) {

        int missed = 0;
        for (int i = 0; i <nums.length ; i++) {
            missed+=i-nums[i];
        }
        missed+=nums.length;
        return missed;
    }


    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
