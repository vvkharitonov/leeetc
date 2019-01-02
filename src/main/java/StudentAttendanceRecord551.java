public class StudentAttendanceRecord551 {

    public static boolean checkRecord(String s) {
            int goodToGoA = 0;
            boolean goodToGoL = true;

            if (s.length() <= 3)
            {
                if(s.charAt(0)=='L' && s.charAt(1)=='L'&& s.charAt(2)=='L')return false;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'A')
                    {
                        goodToGoA++;
                    }
                }
                if (goodToGoA>1) {return false;}

                else return true;
            }

            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == 'A') {
                    goodToGoA++;

                }

                if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') goodToGoL = false;
            }

            if (s.charAt(s.length()-1) == 'A')
            {
                goodToGoA++;
            }

            if (s.charAt(s.length()-2) == 'A')
            {
                goodToGoA++;
            }

            for (int i = s.length()-1; i >= s.length() - 2; i--) {

                if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') goodToGoL = false;

            }
            return ((goodToGoA>1 || goodToGoL==false)?false:true);
    }

    public static void main(String[] args) {

        String s ="PPALLP";

        System.out.println(checkRecord(s));
    }
}
