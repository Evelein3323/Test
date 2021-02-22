import java.util.Locale;

public class main{
    public static void main(String[] args){

        int n = 4;

        n = n % 3 == 1 ? 1 : 0;

        System.out.println(n - n % 1);
    }
}
