public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums) {
        int sumleft=0;
        int sumright=0;
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];
        int i=0;
        int j = nums.length-1;

        for (int k = 1; k <nums.length; k++) {
            sumleft+=nums[k-1];
        left[k]=sumleft;

        sumright+=nums[nums.length-k];
        right[nums.length-k-1]=sumright;

    }

        for (int k = 0; k <nums.length-1; k++)
        {
            if (left[k]==right[k]) return k;
        }

//        while(i<nums.length && i<j){
//            sumleft+=nums[i];
//            while (j>0 && j>i ){
//                if (sumleft==sumright && j-i==1) return j;
//                sumright+=nums[j];
//                if (sumleft==sumright&& j-i==1) return j-1;
//                j--;
//                if  (sumleft<sumright) break;
//            }
//            i++;
//        }
        return -1;


    }

    public static void main(String[] args) {
//        int[] nums = {-1,-1,-1,-1,-1,-1};
        int[] nums ={-1,-1,-1,-1,-1,0};
//        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }
}
