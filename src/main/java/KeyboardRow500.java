public class KeyboardRow500 {

    public static String[] findWords(String[] words) {
        String[] out = new String[words.length];
        char[] line1 = new char [] {'q','w','e','r','t','y','u','i','o','p'};
        char[] line2 = new char [] {'a','s','d','f','g','h','j','k','l'};
        char[] line3 = new char [] {'z','x','c','v','b','n','m'};

        int wordCount=0;
        int inLine1=0;
        int inLine2=0;
        int inLine3=0;

        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j < words[i].length() ; j++) {
                for (int k = 0; k < line1.length; k++) {
                    if(words[i].toLowerCase().charAt(j)==line1[k])
                    inLine1++;
                }
                for (int k = 0; k < line2.length; k++) {
                    if(words[i].toLowerCase().charAt(j)==line2[k])
                    inLine2++;
                }
                for (int k = 0; k < line3.length; k++) {
                    if(words[i].toLowerCase().charAt(j)==line3[k])
                    inLine3++;
                }
            }
            if (inLine3==words[i].length() || inLine2==words[i].length() ||inLine1==words[i].length() )
            out[wordCount++] = words[i];
            inLine1=0;
            inLine2=0;
            inLine3=0;
        }
//        for (int i = 0; i <words.length ; i++) {
//            System.out.println(out[i]);
//        }
        String[] out1 = new String[wordCount];
        for (int i = 0; i <wordCount ; i++) {
            out1[i]=out[i];
        }

        for (int i = 0; i <wordCount; i++) {
            System.out.println(out1[i]);
        }

        return out1;
    }


    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        findWords(words);


    }

}
