import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SingleNumber136 {

//    HashSet<String> countryHashSet = new HashSet<>();

    public static int singleNumber(int[] nums) {
        int out=0;
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 2);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                out= entry.getKey();
            }
        }

        System.out.println(out);
       return out;
    }
    

    public static void main(String[] args) {
        int[] nums= {4,1,2,1,2};
        singleNumber(nums);
    }

}
