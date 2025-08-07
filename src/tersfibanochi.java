import java.util.Scanner;

public class tersfibanochi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fn = a, fn1 = b;
        int f2 = b - a;

        for (int i = n; i > 1; i--) {
            f2 = fn1 - fn;
            fn1 = fn;
            fn = f2;
        }
        System.out.println(fn+ " " +fn1 );


    }
}
