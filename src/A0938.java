import java.util.Scanner;
public class A0938 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int tkop = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int k =0;
            for (int j = 2; j <=x ; j++) {
                if (tubMa(j) && x%j==0) k++;
            }
            if (k>sum || k==sum && x<tkop){
                sum =k;
                tkop = x;
            }
        }
        System.out.println(tkop);
    }
    static boolean tubMa(int q) {
        if (q < 2 || q > 2 && q % 2 == 0) return false;
        for (int i = 2; i * i <= q; i++) {
            if (q % i == 0) return false;
        }
        return true;
    }
}
