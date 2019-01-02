public class Anagram242 {

//    public static boolean isAnagram(String s, String t) {
////    boolean ret=true;
//        if (s.length()!=t.length()) return false ;
//        char[] chars = s.toCharArray();
//        char[] chart = t.toCharArray();
//        int num=0;
//
//
//        for (int i = 0; i <s.length() ; i++) {
//            for (int j = 0; j <s.length() ; j++) {
//                if (chars[i] == chart[j])
//                {
//                    chars[i]=0;
//                    chart[j]=0;
//                    continue;
//                }
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            num+=chars[i];
//        }
//
//        return (num==0);
//    }



    public static boolean isAnagram(String s, String t) {
//    boolean ret=true;
        if (s.length()!=t.length()) return false ;
        int [] chrs = new int [26];
        int [] chrt = new int [26];
        int num=0;

        for (int i = 0; i < 26 ; i++) {
            chrs[i]=0;
            chrt[i]=0;
        }

            for (int i = 0; i <s.length() ; i++) {
                chrs[s.charAt(i)-97]+=1;
                chrt[t.charAt(i)-97]+=1;

        }
        for (int i = 0; i < 26; i++) {
            num+=(chrs[i]==chrt[i]?0:1);
        }

        return (num==0);
    }

    public static void main(String[] args) {
//        String s="a";
//        String t="b";

        String s="zlap";
        String t="kcqx";

        System.out.println(isAnagram(s,t));
        }
}
