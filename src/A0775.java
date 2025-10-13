import java.math.BigInteger;
import java.util.Scanner;

public class A0775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger p = BigInteger.ONE;
        while (p.compareTo(n) < 0) {
            p = p.multiply(BigInteger.TWO);
        }
        if (p.compareTo(n.add(m)) <= 0) {
            System.out.println(p);
        } else {
            System.out.println("NO");
        }
    }
}
