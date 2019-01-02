import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class q448 {


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> retu = new LinkedList<Integer>();

        if (nums.length==0)
        {
            return retu;
        }
        else
        {

            for (int i = 0; i <nums.length; i++){
            retu.add(-2147483648);
            }
            for (int i = 0; i < nums.length; i++) {
                retu.set(nums[i]-1, 0);
            }
            for (int i = 0; i < nums.length; i++) {
                if (retu.get(i) ==-2147483648) retu.set(i,i+1);
            }
            for (int i = retu.size()-1; i >= 0; i--) {
                if (retu.get(i) == 0) retu.remove(i);
            }
            return retu;
        }
    }

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> retu = new ArrayList<Integer>();
        retu=findDisappearedNumbers(nums);

        for (int i = 0; i < retu.size() ; i++) {
            System.out.println(retu.get(i));
        }

    }

}

