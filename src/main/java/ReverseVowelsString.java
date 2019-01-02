import com.sun.javafx.image.BytePixelSetter;

public class ReverseVowelsString {

    public static String reverseVowels(String s) {
        String out;
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();


//        a,e,u,i,o
        char on;
        char tw;


        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' ||Character.toLowerCase(s.charAt(i)) == 'u' || Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o') {
                for (int j = s.length() - 1; j >= i; j--) {
                    if ( j-i==1) {
                        one.append(s.charAt(i));
                        out = one.toString() + two.reverse().toString();
                        return out;
                    }
                    if (Character.toLowerCase(s.charAt(j)) == 'a' || Character.toLowerCase(s.charAt(j)) == 'e' || Character.toLowerCase(s.charAt(j)) == 'u' || Character.toLowerCase(s.charAt(j)) == 'i' || Character.toLowerCase(s.charAt(j)) == 'o') {
                        one.append(s.charAt(j--));
                        two.append(s.charAt(i++));
                        if ( i-j==1) {
                            out = one.toString() + two.reverse().toString();
                            return out;
                        }

                    }
                    else{
                    two.append(s.charAt(j));

                    }
                }
            }
            else
            one.append(s.charAt(i));
        }


        out = one.toString() + two.reverse().toString();
        return out;

    }


    public static void main(String[] args) {
        String s="hello";
//        String s="ai";

        System.out.println(reverseVowels(s));
    }
}
