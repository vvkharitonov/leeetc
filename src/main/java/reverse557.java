public class reverse557 {


    public static String reverseWords(String s) {
        String str,tempString,tempString2;
        tempString = "";
        tempString2 = "";
        str="";

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' ') {
                for (int j = tempString.length()-1; j >=0; j--) {
                    tempString2+=tempString.charAt(j);
                }
                str += tempString2;
                str +=' ';
                tempString = "";
                tempString2 = "";
            }
            else
            {tempString+=s.charAt(i);}
        }
        for (int j = tempString.length()-1; j >=0; j--) {
            tempString2+=tempString.charAt(j);
        }
        str += tempString2;
        System.out.println(str);
        return str;
    }


    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        reverseWords(str);
    }



}
