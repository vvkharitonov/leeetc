import java.util.Arrays;

public class Intersection_of_Two_Arrays349
{
    public static int[] intersection(int[] nums1, int[] nums2) {
     int[] nums3 = {};
        boolean add = false;
        boolean added = false;

        int index = 0;
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if(nums1[i]==nums2[j]) add = true;
            }
            if (add) {
                for (int j = 0; j <nums3.length ; j++) {
                    if (nums1[i]==nums3[j]) added=true;
                }
                if (!added){
                    nums3 = Arrays.copyOf(nums3,index+1);
                    nums3[index++]=nums1[i];}
                added=false;
                add = false;
            }
        }
     return nums3;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

        int[] nums3=intersection(nums1,nums2);

    }
}
