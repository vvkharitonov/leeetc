import java.util.*;

public class RelativeRaank506 {

//    public static String[] findRelativeRanks(int[] nums) {
//        String[] str=new String[nums.length];
//        int max=0;
//        int mean=0;
//        int low=0;
//
//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i]>max)
//            {
//                low = mean;
//                mean = max;
//                max=i;
//            }
//        }
//
//        for (int i = 0; i <nums.length; i++) {
//            str[i]=Integer.toString();
//        }

    public static String[] findRelativeRanks(int[] nums) {
        String[] str=new String[nums.length];
        Map<Integer,Integer> sortedMAP = new TreeMap<Integer, Integer>();
        int max=0;
        int mean=0;
        int low=0;
        int total=nums.length;

        for (int i = 0; i <nums.length ; i++) {
            sortedMAP.put(nums[i],i);
//            if (nums[i]>max)
//            {
//                low = mean;
//                mean = max;
//                max=i;
//            }
        }


        Set s = sortedMAP.entrySet();
        Iterator i = s.iterator();

        int iter = 0;

        while (i.hasNext())
        {
            Map.Entry m = (Map.Entry)i.next();

            int key = (Integer)m.getKey();
            int value = (Integer)m.getValue();

            str[value]=Integer.toString( total-iter);
            if (iter==total-3) str[value] = "Bronze Medal";
            if (iter==total-2) str[value] ="Silver Medal";
            if (iter==total-1) str[value] ="Gold Medal";
                    iter++;

//            System.out.println("Key : " + key +
//                    "  value : " + value);
        }

//        for (int j = 0; j <nums.length; j++) {
////            str[i]=Integer.toString(nums[i]);
//            if (j==low) str[j] = "Gold Medal";
//            if (j==mean) str[j] = "Silver Medal";
//            if (j==max) str[j] = "Bronze Medal";
//        }

        return str;
    }


    public static void main(String[] args) {
//        int[] nums={5, 4, 3, 2, 1};
        int[] nums={10,3,8,9,4};
        for (String str:findRelativeRanks(nums)
             ) {
            System.out.println(str);
        }

    }
}
