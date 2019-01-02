import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {


    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> numberz = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (i > 0 & i < 10) {
                numberz.add(i);
            } else {
                String n = Integer.toString(i);
                char[] charArray = n.toCharArray();

                boolean add = false;
                for (int j = 0; j < charArray.length; j++) {
                    if (Character.getNumericValue(charArray[j]) == 0) {
                        add = false;
                        break;}

                    if (i % Character.getNumericValue(charArray[j]) == 0) {
                        add = true;
                    } else {
                        add = false;
                        break;
                    }
                }

                if (add) numberz.add(i);

                add = false;

            }
        }
        System.out.println(numberz);
        return numberz;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers = selfDividingNumbers(1,5);
        System.out.println(selfDividingNumbers(1,22));
    }

}


