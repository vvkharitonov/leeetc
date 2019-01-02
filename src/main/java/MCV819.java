import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MCV819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String ss="";
        StringBuilder builder = new StringBuilder();
        boolean newword = true;

        Map<String, Integer> sortedMAP = new TreeMap<String, Integer>();

        for (int i = 0; i < paragraph.length(); i++) {
            if (Character.isLetter(paragraph.charAt(i))) {
//                if (newword) {
                    builder.append(Character.toLowerCase(paragraph.charAt(i)));
//                }
//                else {
//                    builder.append(Character.toLowerCase(paragraph.charAt(i)));
//                }
                if (i==paragraph.length()-1) {
                    if (sortedMAP.get(builder.toString()) == null) {
                        sortedMAP.put(builder.toString(), 1);
                    } else sortedMAP.put(builder.toString(), sortedMAP.get(builder.toString()) + 1);
                }
            } else {
                if (sortedMAP.get(builder.toString()) == null) {
                    sortedMAP.put(builder.toString(), 1);
                } else sortedMAP.put(builder.toString(), sortedMAP.get(builder.toString()) + 1);
                builder.setLength(0);
            }

        }

        Set s = sortedMAP.entrySet();
        Iterator i = s.iterator();
        int maxcount=0;
        boolean bann=false;

        while (i.hasNext()){
            Map.Entry m = (Map.Entry)i.next();
            String key = (String)m.getKey();
            int value = (Integer)m.getValue();
            if (value>maxcount && !key.equals("")) {

                for (int j = 0; j < banned.length; j++) {
                    if (key.equals(banned[j])) bann=true;
                                    }
                if (bann==false) {
                    ss=key;
                    maxcount=value;
                }
            }
             bann=false;


        }

        return ss;
    }


//
//        Set s = sortedMAP.entrySet();
//        Iterator i = s.iterator();
//
//        int iter = 0;
//
//        while (i.hasNext())
//        {
//            Map.Entry m = (Map.Entry)i.next();
//
//            int key = (Integer)m.getKey();
//            int value = (Integer)m.getValue();
//
//            str[value]=Integer.toString( total-iter);
//            if (iter==total-3) str[value] = "Bronze Medal";
//            if (iter==total-2) str[value] ="Silver Medal";
//            if (iter==total-1) str[value] ="Gold Medal";
//            iter++;



    public static void main(String[] args) {
        String paragraph="Bob. hIt, baLl";
        String[] banned={"bob", "hit"};

        System.out.println(mostCommonWord(paragraph,banned));
    }
}
