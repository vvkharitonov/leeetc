public class Palindrome9 {


    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x==0) return true;
        int[] arr= new int[11];
        int size=0;
//        2 147 483 647
        for (int i = 0; i <=10 ; i++) {
            arr[i]=x/(int)Math.pow(10,i)%10;
            if(arr[i]!=0) size = i+1;
        }
        if (size ==1) return true;

        switch (size){
            case 3:
            case 5:
            case 7:
            case 9:
                for (int i = 0 ; i <size ; i++) {
                    if (arr[i]!=arr[size-i-1]) break;
                    if (i==size/2) return true;
                }
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                for (int i = 0 ; i <size ; i++) {
                    if (arr[i]!=arr[size-i-1]) break;
                    if (i==size/2) return true;
                }

        }




//    summ=num/1000000000%10+num/100000000%10+num/10000000%10+num/1000000%10+num/100000%10+num/10000%10+num/1000%10+num/100%10+num/10%10+num%10;

        return false;

    }


    public static void main(String[] args) {
        System.out.println (isPalindrome(1221));
    }
}
