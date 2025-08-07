import java.util.Scanner;

public class A0844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        double c = Math.sqrt( a * b );
        if (c % 1 == 0) {
            System.out.println((int) c);
        } else {
            System.out.println(0);
        }
    }
}
