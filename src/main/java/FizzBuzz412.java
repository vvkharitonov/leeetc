import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> out = new ArrayList<String> ();

        for (int i = 1; i <=n ; i++) {
            out.add(i+"");
        }

        for (int i = 3; i <=n ; i=i+3) {
            out.set(i-1,"Fizz");
        }

        for (int i = 5; i <=n ; i=i+5) {
            if (out.get(i-1)=="Fizz") out.set(i-1,"FizzBuzz"); else out.set(i-1,"Buzz");
        }
        System.out.println(out);

        return out;
    }

    public static void main(String[] args) {
        int n=15;
        fizzBuzz(n);
    }
}
