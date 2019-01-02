public class MaximumProductThreeNumbers628 {

    public static int maximumProduct(int[] nums) {
        int x1=Integer.MIN_VALUE;
        int x2=Integer.MIN_VALUE;
        int x3=Integer.MIN_VALUE;

        int x4=Integer.MAX_VALUE;
        int x5=Integer.MAX_VALUE;


        for (int i = 0; i <nums.length ; i++) {
            if (x1 <= nums[i]) {
                x3=x2;
                x2=x1;
                x1 = nums[i];
            } else {
                if (x2 <= nums[i]) {
                    x3=x2;
                    x2 = nums[i];}
                else {
                    if (x3 <= nums[i]) x3 = nums[i];
                }
            }

            if (x4 >= nums[i]) {
                x5=x4;
                x4 = nums[i];}
            else {
                if (x5 >= nums[i]) x5 = nums[i];
            }

        }

        return (x1*x2*x3>x1*x4*x5?x1*x2*x3:x1*x4*x5);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
}
