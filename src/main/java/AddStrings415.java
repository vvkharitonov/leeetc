public class AddStrings415 {


    public static String addStrings(String num1, String num2) {
        String large,small;
        StringBuilder builder = new StringBuilder();
        int temp;
        int temp1=0;
        int delta=0;
        boolean equal = false;

        if (num1.length()==num2.length())
        {
            equal=true;

        }

        if (num1.length()>num2.length())
        {
            large=num1;
            small=num2;
        }
        else
        {
            large=num2;
            small=num1;
        }

        delta=large.length()-small.length();
        int counter=small.length()-1;
int smallvalue;

        for (int i =large.length()-1; i >=0 ; i--) {
            if(counter>=0){
                smallvalue=Integer.parseInt(String.valueOf(small.charAt(counter--)));
            }
            else
            {smallvalue=0;}
            temp=temp1+
                    Integer.parseInt(String.valueOf(large.charAt(i)))+
                    smallvalue;
            if (temp > 9) {
                temp %= 10;
                temp1 = 1;
            } else {
                temp1 = 0;
            }
            builder.append(Integer.toString(temp));

        }


        if (!equal) {

//            temp = temp1 + Integer.parseInt(String.valueOf(large.charAt(large.length()- small.length()-1)));
//            if (temp > 9) {
//                temp %= 10;
//                temp1 = 1;
//            } else {
//                temp1 = 0;
//            }

//            builder.append(Integer.toString(temp));

////            if (large.length()-small.length()>1) {
//                for (int i = small.length() ; i >= 0; i--) {
//                    temp = temp1 + Integer.parseInt(String.valueOf(large.charAt(i)));
//                        if (temp > 9) {
//                            temp %= 10;
//                        temp1 = 1;
//                    } else {
//                        temp1 = 0;
//                    }
//                    builder.append(temp);
////                }
//            }
        }

        if (temp1 == 1) builder.append("1");



        builder.reverse();
        return builder.toString();
    }

    public static void main(String[] args) {
        String num1="408";
        String num2="5";

        System.out.println(addStrings(num1,num2));
    }
}
