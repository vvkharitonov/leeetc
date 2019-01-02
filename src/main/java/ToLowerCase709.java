public class ToLowerCase709 {


    public static String toLowerCase(String str) {
        String out="";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<=90&&str.charAt(i)>=65)
            out +=(char)((int)str.charAt(i)+97-65);
            else out +=str.charAt(i);

        }


        return out;

    }


    public static void main(String[] args) {
        String str="LOVELY";
        System.out.println(toLowerCase(str));
    }
}