public class PowerofFour {

    public static boolean isPowerOfFour(int num) {
        boolean b;
        if ((num&5592405)==num) b=true;
        if (num<=0) return false;
        if ((num&num-1)!=0)return false;

        if (((num>>3)%7==num%7 || (num<<3)%7==num%7 ) && (int)(num&5592405)==num && (num>0 && (num&num-1)==0) ) return true;

        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
}
