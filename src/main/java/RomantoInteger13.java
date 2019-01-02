public class RomantoInteger13 {

    public static int romanToInt(String s) {

        int year=0;


        if (s.contains("IV")) {
            year+=4;
            s=s.substring(0,s.length()-2);
        }

        if (s.contains("IX")) {
            year+=9;
            s=s.substring(0,s.length()-2);
        }
        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {

                if (s.charAt(s.length() - 1) == 'I') {
                    year += 1;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {
                if (s.charAt(s.length() - 1) == 'V') {
                    year += 5;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }

        if (s.contains("XL")) {
            year+=40;
            s=s.substring(0,s.length()-2);
        }

        if (s.contains("XC")) {
            year+=90;
            s=s.substring(0,s.length()-2);
        }

        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {
                if (s.charAt(s.length() - 1) == 'X') {
                    year += 10;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {
                if (s.charAt(s.length() - 1) == 'L') {
                    year += 50;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }


        if (s.contains("CD")) {
            year+=400;
            s=s.substring(0,s.length()-2);
        }

        if (s.contains("CM")) {
            year+=900;
            s=s.substring(0,s.length()-2);
        }

        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {

                if (s.charAt(s.length() - 1) == 'C') {
                    year += 100;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (!s.isEmpty()) {
                if (s.charAt(s.length() - 1) == 'D') {
                    year += 500;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='M')
            {
                year+=1000;

            }
        }

        for (int i = 0; i <s.length(); i++) {

        }

        for (int i = s.length()-1; i <=-0 ; i++) {

        }
        return year;
    }

//    Input: "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

//
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s) + "=" + s);
    }
}
