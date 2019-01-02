public class DetectCapital520 {

    public static boolean detectCapitalUse(String word) {
        boolean allCasps=false, allSmall=true, firstLarge=false;
        char[] xx= word.toCharArray();

        if ( Character.isUpperCase(xx[0]))
        {
            firstLarge=true;
            allCasps=true;
            allSmall=false;

        }

        for(int i=1;i<xx.length;i++) {
            if(Character.isLowerCase(xx[i])) {
                allCasps=false;
            }
            else {
                allSmall=false;
                firstLarge=false;
            }

        }


        return (allCasps||allSmall||firstLarge);

    }

    public static void main(String[] args) {
        String word="mL";
        System.out.println(detectCapitalUse(word));
    }
}
