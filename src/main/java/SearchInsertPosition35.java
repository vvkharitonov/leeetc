public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {

        int out=0;
        if (target<=nums[0]) return 0;
        if (target>nums[nums.length-1]) return nums.length;

        for (int i = 0; i <nums.length-1 ; i++) {
            if (target>nums[i]) {
            }
            else return i;
        }


        return out;

    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;

        System.out.println(searchInsert(nums,target));
    }
}
