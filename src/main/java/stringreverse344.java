public class stringreverse344 {

    public static String reverseString(String s) {
        String str="";
        StringBuilder builder = new StringBuilder();

        for (int i = s.length()-1; i >=0 ; i--) {
            builder.append(s.charAt(i));
        }
        str=builder.toString();
        System.out.println(str);
        return str;
    }


    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        reverseString(str);
    }
}
