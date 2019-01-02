import static java.lang.StrictMath.pow;

public class ExcelSheetColumnNumber171 {
    public static int titleToNumber(String s) {
        int num=0;
        int mult=1;
        for (int i = 0; i < s.length(); i++) {
            mult =i==0?1:mult*26 ;
            num += (s.charAt(s.length() - 1 - i) - 64) * mult;
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "AA";

        System.out.println(titleToNumber(s));
    }

}
