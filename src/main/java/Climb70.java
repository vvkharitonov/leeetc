public class Climb70 {


//    public static int climbStairs(int n) {
//        if (n==1) return 1;
//        if (n==2) return 2;
//        if (n>=3) return (climbStairs(n-2)+climbStairs(n-1));
//        return 0;
//    }

    public static int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int sum_fib=0;
        for(int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
        }
        return sum_fib;
    }





    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
