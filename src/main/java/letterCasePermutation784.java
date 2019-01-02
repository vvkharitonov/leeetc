import java.util.ArrayList;
import java.util.List;

public  class letterCasePermutation784 {

    public static List<String> letterCasePermutation(String S) {

        List<String> lizd=new ArrayList<String>();

        Character chat;

            if (S.length()==1) {
                if (Character.isDigit(S.charAt(0))) {
                    lizd.add(S);
                } else {
                    if (Character.isUpperCase(S.charAt(0))) {
                        lizd.add(S);
                        lizd.add(S.toLowerCase());
                    } else {
                        lizd.add(S);
                        lizd.add(S.toUpperCase());
                    }
                }
        }
        else
        {
            if (S.length()==0) return lizd;
            List<String> lizdTemp;
            lizdTemp = letterCasePermutation(S.substring(1));
            if (Character.isDigit(S.charAt(0))) {
                chat = S.charAt(0);
                for (int i = 0; i < lizdTemp.size(); i++) {
                    lizd.add(chat + lizdTemp.get(i));
                }
            } else {
                if (Character.isUpperCase(S.charAt(0))) {
                    for (int i = 0; i < lizdTemp.size(); i++) {
                        lizd.add(S.charAt(0) + lizdTemp.get(i));
                        lizd.add(S.toLowerCase().charAt(0) + lizdTemp.get(i));
                    }
                } else {
                    for (int i = 0; i < lizdTemp.size(); i++) {
                        lizd.add(S.charAt(0) + lizdTemp.get(i));
                        lizd.add(S.toUpperCase().charAt(0) + lizdTemp.get(i));
                    }
                }
            }
        }

        System.out.println("Size is" +lizd.size());
        for (int i = 0; i < lizd.size(); i++) {
            System.out.println(lizd.get(i));
        }
        return lizd;

    }

    public static void main(String[] args) {
//        String S="a1b2";
//        String S="qwsedrfta1b2";
        String S="1231232";
        //        String S="a1";

        letterCasePermutation(S);
    }

}
