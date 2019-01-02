import java.util.*;

public class SetMismatch645 {


    public static int[] findErrorNums(int[] nums) {
        int[] out = new int[2];
        int[] sorted = new int[nums.length];
        Map<Integer,Integer> sortedMAP= new TreeMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (sortedMAP.get(nums[i]) == null) {
                sortedMAP.put(nums[i], i);
            } else {out[0]=nums[i];}
        }

        Set s = sortedMAP.entrySet();
        Iterator i = s.iterator();

        if (sortedMAP.size()==1)
        {
            Map.Entry m = (Map.Entry) i.next();
            int key = (Integer) m.getKey();
            out[1]=key+1;
            return out;
        }

        int prev_key=0;


        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();
            int key = (Integer) m.getKey();
            if (key-prev_key!=1)
            {
                out[1]=prev_key+1;
                break;
            }
            prev_key=key;


        }

        if (out[1]==0) out[1]=nums.length;






        return out;
    }


    public static void main(String[] args) {
//        int[] nums={1,2,2,4};
        int[] nums={1,5,3,2,2,7,6,4,8,9};
        System.out.println(findErrorNums(nums)[0] + " " + findErrorNums(nums)[1]);
    }
}
