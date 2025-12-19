import java.util.Scanner;
public class A0910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        long sum = 0;
        long fac = 1;
        for (int k = 1; k <= n; k++) {
            fac = (fac * k) % m;
            long pow2 = modPow(k, m);
            long qsm = (fac * pow2) % m;
            sum = (sum + qsm) % m;
        }
        System.out.println(sum);
    }

    static long modPow(int ks, long mod) {
        long jvb = 1;
        for (int i = 1; i <= ks; i++) {
            jvb = (jvb * 2) % mod;
        }
        return jvb;
    }
}
