public class FirstUniqueCharacterString387 {

    public static int firstUniqChar(String s) {
    int num;
        int [] repeated = new int [26];
        boolean [] repeat = new boolean [s.length()];
        for (int i = 0; i <26 ; i++) {
            repeated[i]=0;
        }
        for (int i = 0; i <s.length() ; i++) {
            repeat[i]=false;
        }

        for (int i = 0; i < s.length(); i++) {
            repeated[s.charAt(i)- 97]+=1;
            if ((repeated[s.charAt(i)- 97])>1) {repeat[i] = true;}
        }

        for (int i = 0; i < s.length(); i++) {
            if ((repeated[s.charAt(i)- 97])==1) return i;
        }

        return -1;

        }

    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
