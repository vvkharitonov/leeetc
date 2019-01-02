public class MaxConsecutiveOnes485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            j = nums[i] == 1 ? j + 1 : 0;
            if (j > max) max = j;
        }

        System.out.println(max);
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);

    }
}

