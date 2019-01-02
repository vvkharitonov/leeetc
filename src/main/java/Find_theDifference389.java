public class Find_theDifference389 {

    public static char findTheDifference(String s, String t) {
        int add=0;
        for (int i = 0; i <s.length() ; i++) {
            add+=s.charAt(i)-t.charAt(i);
        }
        add-=t.charAt(s.length());
        add=-add;
        return (char) add;
    }

    public static void main(String[] args) {

        String s;
        String t;

        s = "abcd";
        t = "abcde";

        System.out.println(findTheDifference(s,t));

    }

}
