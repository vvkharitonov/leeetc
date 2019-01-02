public  class JewelsStones771 {
    public static int numJewelsInStones(String J, String S) {
        int ret=0;
        int count=0;
        for (int i = 0; i <J.length() ; i++) {
            for (int j = 0; j <S.length() ; j++) {
                if(J.charAt(i)==S.charAt(j)) count++;
            }
            ret += count;
            count =0;
        }
        return ret;
    }

    public static void main(String[] args) {

        String J="aA";
        String S="aAAbbbb";

        System.out.println(numJewelsInStones(J,S));
    }

}
