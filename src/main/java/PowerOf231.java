public class PowerOf231 {

//    public static boolean isPowerOfTwo(int n) {
//
//        int two = 2;
//        if (n==1) return true;
//        if (n%10==1||n%10==3||n%10==5||n%10==7||n%10==9) return false;
//        for (int i = 0; i <=n/2+1 ; i++) {
//            if (two==n) return true;
//            two*=2;
//        }
//        return false;
//
//    }
//    1108 / 1108 test cases passed.
//            Status: Accepted
//    Runtime: 416 ms

    public static boolean isPowerOfTwo(int n) {
        if (n==1) return true;
        if (n%10==1||n%10==3||n%10==5||n%10==7||n%10==9) return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2147483647));
    }
}
