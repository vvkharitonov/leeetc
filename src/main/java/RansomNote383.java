public class RansomNote383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length()) return false;
        boolean [] used = new boolean [magazine.length()];
        int i =0;
        while (i < magazine.length()){
            used[i++]=false;
        }

        for (int j = 0; j <ransomNote.length() ; j++) {
            for (int k = 0; k <magazine.length() ; k++) {
                if(ransomNote.charAt(j)==magazine.charAt(k) && used[k]==false )
                {
                    used[k]=true;
                    break;
                }
            }
        }
        int size=0;

        for (int j = 0; j < magazine.length(); j++) {
            if (used[j]) size++;
        }

        if (size==ransomNote.length()) {return true;}
        else return false;

    }

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";

        System.out.println(canConstruct(ransomNote,magazine));

    }
}
