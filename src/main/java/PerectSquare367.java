public class PerectSquare367 {
    public static boolean isPerfectSquare(int num) {
        if (num <= 0) return false;

        for (int i = 0; i < 46341 ; i++) {
            if (i*i==num) return true;
                if (i>num) break;
        }
        return false;
}




    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
