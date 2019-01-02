public class RotateString796 {

//    public static boolean rotateString(String A, String B) {
//
//            if (A.length() != B.length()) return false;
//            if (A.length() == 0) return true;
//            if (A.length() == 1 && A.charAt(0) == B.charAt(0)) return true;
//            if (A.length() == 2 && A.charAt(0) == B.charAt(0) && A.charAt(1) == B.charAt(1)) return true;
//            if (A.charAt(0) != B.charAt(A.length() - 3) || A.charAt(1) != B.charAt(A.length() - 2)) return false;
//            for (int i = 2; i < A.length(); i++) {
//                if (B.charAt(i) != A.charAt(i - 2)) return false;
//            }
//            return true;
//    }


    public static boolean rotateString(String A, String B) {

        A=A+A;

        if (A.contains(B)) return true;
        return false;
    }



    public static void main(String[] args) {
         String A= "abcde";
        String B = "cdeab";

        System.out.println(rotateString(A,B));

    }

}
