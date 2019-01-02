import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Harmonious94 {


    public static int findLHS(int[] nums) {

        Map<Integer,Integer> sortedMAP= new TreeMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (sortedMAP.get(nums[i]) == null) {
                sortedMAP.put(nums[i], 1);
            } else sortedMAP.put(nums[i], sortedMAP.get(nums[i]) + 1);
        }

        Set s = sortedMAP.entrySet();
        Iterator i = s.iterator();
        int prev_key=0;
        int prev_value=0;
        int maxcount=0;
        boolean first = true;

        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();
            int key = (Integer) m.getKey();
            int value = (Integer)m.getValue();

            if (first){
                first=false;
                prev_key=key;
                prev_value=value;
            }
            else
            {
                if(key-prev_key==1 && prev_value+value>maxcount) maxcount=prev_value+value;
                prev_key=key;
                prev_value=value;
            }


        }


        return maxcount;

    }


    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }


}
