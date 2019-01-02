import java.util.Set;
import java.util.TreeSet;

public class UglyNumber263 {



    public static boolean isUgly(int num) {
        Set<Integer> treeSet = new TreeSet<Integer>();
        boolean ugly = false;
        if (num <= 0) return false;

        int temp2 = 1;
        int temp3 = 1;

        for (int i = 1; i < 32; i++) {
            if (Math.pow(2, i) < 2147483647) {
                treeSet.add((int)Math.pow(2, i));
            }
            if (Math.pow(3, i) < 2147483647) {
                treeSet.add((int)Math.pow(3, i));
            }
            if (Math.pow(5, i) < 2147483647) {
                treeSet.add((int)Math.pow(5, i));
            }
        }

        for (int i = 0; i < 32; i++) {
            if (Math.pow(2, i) > 2147483647)
            {
                break;
            }
            else{
                temp2 = (int) Math.pow(2, i);
                treeSet.add(temp2);
            }
            for (int j = 0; j < 30; j++) {
                if (Math.pow(3, i) * temp2 > 2147483647)
                {
                    break;
                }
                else{
                    temp3 = (int) Math.pow(3, j) * temp2;
                    treeSet.add(temp3);
                }
                for (int k = 0; k < 28; k++) {
                    if (Math.pow(5, i) * temp3 > 2147483647)
                    {
                        break;
                    }
                    else
                    {
                        treeSet.add( (int) Math.pow(5, k) * temp3);
                    }
                }
            }


        }


        for (int i : treeSet){
            if (num==i) ugly=true;
        }


        return ugly;
    }


//    public static boolean is1Ugly(int num) {
//        boolean ugly = false;
//        int [] allUgly= new int [7000];
//        int counter=0;
//        int temp2=1;
//        int temp3=1;
//
//
//
//        for (int i = 1; i < 32 ; i++) {
//            if (Math.pow(2,i)<2147483647) {
//                temp2=(int)Math.pow(2, i);
//                allUgly[counter++] = temp2;
//            }
//            for (int j = 1; j <30 ; j++) {
//                if (Math.pow(3,i)*temp2<2147483647) {
//                    temp3=(int)Math.pow(3, i)*temp2;
//                    allUgly[counter++] = temp3;
//                }
//                for (int k = 1; k <28 ; k++) {
//                    if (Math.pow(5,i)*temp3<2147483647) {
//                        allUgly[counter++] = (int)Math.pow(5,i)*temp3;
//                    }
//                }
//            }
//
//
//        }
//            allUgly[counter++] = 1;
//            allUgly[counter++] = 2;
//            allUgly[counter++] = 3;
//            allUgly[counter++] = 5;
//        for (int i = 0; i <counter ; i++) {
//            System.out.println(allUgly[i]);
////            if (num==allUgly[i]) return true;
//        }
//        System.out.println(counter);
//
//
//        return ugly;
//
//    }


//    public static boolean isUgly(int num) {
//        boolean ugly = true;
//        int number = num;
//        int counter = 0;
//        int[] allUgly = new int[7000];
//        boolean x = false;
//        if (num <= 0) return false;
//
//        if (num % 2 == 0 && num / 2 > 1000) return false;
//        if (num % 3 == 0 && num / 3 > 1000) return false;
//        if (num % 5 == 0 && num / 5 > 1000) return false;
//
//        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) return false;
//
//        if (num % 2 == 0 && num / 2 > 1000) return false;
//        if (num % 3 == 0 && num / 3 > 1000) return false;
//        if (num % 5 == 0 && num / 5 > 1000) return false;
//
//
//        for (int i = 2; i < num / 2 + 1; i++) {
//            while (number % i == 0) {
////                allUgly[counter++]=i;
////                if (allUgly[counter-1]!=2&&allUgly[counter-1]!=3&&allUgly[counter-1]!=5) return false;
//                System.out.println(i);
//                if (i != 2 && i != 3 && i != 5) return false;
//
//                x = true;
//                number = number / i;
//            }
//        }
//        if (!x) return false;
//
////        for (int i = 0; i <counter ; i++) {
////            System.out.println(allUgly[i]);
////            if (allUgly[i]!=2&&allUgly[i]!=3&&allUgly[i]!=5) return false;
////        }
//
//        return ugly;
//    }

//    public static boolean isUgly(int num) {
//        boolean ugly = true;
//        int number = num;
//        int counter = 0;
//        boolean x = false;
//        int[] allUgly = new int[7000];
//        if (num == 1) return true;
//        if (num == 2) return true;
//        if (num == 3) return true;
//        if (num == 5) return true;
//        if (num <= 0) return false;
//
//        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) return false;
//
//
////        if (num % 2 == 0 && num / 2 > 10000) return false;
////        if (num % 3 == 0 && num / 3 > 10000) return false;
////        if (num % 5 == 0 && num / 5 > 10000) return false;
//
//
//        for (
//                int i = 2;
//                i < num; i++)
//
//        {
//            while (number % i == 0) {
//                if (i != 2 && i != 3 && i != 5) return false;
//                x = true;
//                System.out.println(i);
//                number = number / i;
//            }
//        }
//
//        //  if (counter==0) return false;
//        if (!x) return false;
//
//
//        return ugly;
//
//}

    public static void main(String[] args) {
        System.out.println(isUgly(1239799931));
    }
}
