public class AddDigits258 {


    public static int addDigits(int num) {
        int summ;
        summ=num/1000000000%10+num/100000000%10+num/10000000%10+num/1000000%10+num/100000%10+num/10000%10+num/1000%10+num/100%10+num/10%10+num%10;
        summ=summ/1000%10+summ/100%10+summ/10%10+summ%10;
        summ=summ/100%10+summ/10%10+summ%10;
        summ=summ/10%10+summ%10;
        return summ;
    }

    public static void main(String[] args) {
//        int num=38;
        int num=2032610959;
        System.out.println(addDigits(num));
    }
}
