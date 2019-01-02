public class GoatLatin824 {

    public static String toGoatLatin(String S) {
        StringBuilder builder = new StringBuilder();
        String tempStr="";
        boolean isvowel=false;
        boolean isFirstLeteer=true;
        char charToEnd='x';

        int counter=1;

        isvowel= (S.toLowerCase().charAt(0)=='a' || S.toLowerCase().charAt(0)== 'e' || S.toLowerCase().charAt(0)== 'i' || S.toLowerCase().charAt(0)== 'o'  || S.toLowerCase().charAt(0)== 'u');

        for (int i = 0; i <S.length() ; i++) {
            if (isFirstLeteer==true) {
//                isvowel = (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u');
            }

            if (S.charAt(i) == ' ')
            {
                if (isvowel)
                {
                    builder.append("ma");
                }
                else {
                    builder.append(charToEnd);
                    builder.append("ma");
                 }
                for (int j = 1; j <= counter; j++) {
                    builder.append('a');}
                builder.append(" ");
                isFirstLeteer=true;
                counter++;
                isvowel = (S.toLowerCase().charAt(i+1) == 'a' || S.toLowerCase().charAt(i+1) == 'e' || S.toLowerCase().charAt(i+1) == 'i' || S.toLowerCase().charAt(i+1) == 'o' || S.toLowerCase().charAt(i+1) == 'u');

            }

            else {

                if (isvowel) builder.append(S.charAt(i));
                else {
                    if (isFirstLeteer)
                    {charToEnd = S.charAt(i);
                        isFirstLeteer = false;}
                else {
                    builder.append(S.charAt(i));
                    isFirstLeteer = false;
                }} ;
            }


        }
        if (isvowel)
        {
            builder.append("ma");
        }
        else {
            builder.append(charToEnd);
            builder.append("ma");
        }
        for (int j = 1; j <= counter; j++) {
            builder.append('a');}


        String str = builder.toString();
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
//        String S="I speak Goat Latin";
        String S="The quick brown fox jumped over the lazy dog";
        toGoatLatin(S);
    }
}
