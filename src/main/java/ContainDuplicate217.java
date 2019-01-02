import java.util.HashMap;

public class ContainDuplicate217 {


    public    static    boolean containsDuplicate(int[] nums) {
        boolean bool=false;
        HashMap<Integer, Integer> cache = new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            if(cache.containsKey(nums[i])){
                bool = true;

                return bool;
            }
            else cache.put(nums[i],1);
        }
         return bool;
    }



    public static void main(String[] args) {
        int[] nums= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
