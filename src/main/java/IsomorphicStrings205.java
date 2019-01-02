import java.util.*;

public class IsomorphicStrings205 {


//    public static boolean isIsomorphic(String s, String t) {
//        boolean iso=false;
//        int[] arr1=new int[26];
//        int[] arr2=new int[26];
//
//
//        Map<Character,Integer> sortedMAP= new TreeMap<Character,Integer>();
//        Map<Character,Integer> sortedMAP1= new TreeMap<Character,Integer>();
//
//        for (int ii = 0; ii <s.length() ; ii++)
//        {
//            if (sortedMAP.get(s.charAt(ii)) == null) {
//                        sortedMAP.put(s.charAt(ii), 1);
//                    }
//                    else sortedMAP.put(s.charAt(ii), sortedMAP.get(s.charAt(ii))+1);
//            if (sortedMAP1.get(t.charAt(ii)) == null) {
//                sortedMAP1.put(t.charAt(ii), 1);
//            }
//            else sortedMAP1.put(t.charAt(ii), sortedMAP1.get(t.charAt(ii))+1);
//        }
//
//
//        if(sortedMAP.size()!=sortedMAP1.size()) return false;
//
//        Set ss = sortedMAP.entrySet();
//        Iterator i = ss.iterator();
//        int counter=0;
//
//        while (i.hasNext()) {
//            Map.Entry m = (Map.Entry) i.next();
//            int value = (Integer)m.getValue();
//
//            arr1[counter]=value;
//            counter++;
//
//        }
//
//
//        Set sss = sortedMAP1.entrySet();
//        Iterator iz = sss.iterator();
//        counter=0;
//
//        while (iz.hasNext()) {
//            Map.Entry m = (Map.Entry) iz.next();
//            int value = (Integer)m.getValue();
//
//            arr2[counter]=value;
//            counter++;
//
//        }
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        for (int j = 0; j <26 ; j++) {
//            if (arr1[j]-arr2[j]!=0) return false;
//        }
//
//
//            return true;
//
//    }




    public static boolean isIsomorphic(String s, String t) {
        boolean iso=false;
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[s.length()];
        char chars,chart;
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        sbS.append(s);
        sbT.append(t);

        for (int i = 0; i <s.length(); i++) {
            if ((sbS.charAt(i)==255 && sbT.charAt(i)!=255) ||(sbS.charAt(i)!=255 && sbT.charAt(i)==255)) return false;
            chars=sbS.charAt(i);
            chart=sbT.charAt(i);
            for (int j = i; j <s.length() ; j++) {
                if(sbS.charAt(j)==chars) sbS.replace(j,j+1,"$");
                if(sbT.charAt(j)==chart) sbT.replace(j,j+1,"$");
            }

        }

        if (sbS.toString().equals(sbT.toString()) ) return true;

            return false;

    }

    public static void main(String[] args) {
        String s="paper";
         String t="title";
        System.out.println(isIsomorphic(s,t));
    }
}
