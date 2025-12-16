import java.util.Scanner;
public class A0520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long pj = 1050, pt = 10250, pq = 114000;
        long qA = n / 144;
        long rem = n % 144;
        long tA = rem / 12;
        long jA = rem % 12;
        if (jA * pj > pt) {
            tA++;
            jA = 0;
        }
        if (tA == 12) {
            qA++;
            tA = 0;
        }
        long costA = qA*pq+tA*pt+jA*pj;
        long qB = qA+((rem>0)? 1: 0);
        long tB=0;
        long jB=0;
        long costB = qB*pq;
        long q, t, j;
        if (costA<costB){
            q=qA; t=tA; j=jA;
        }else {
            q=qB; t=tB; j=jB;
        }
        System.out.println(q + " " + t + " " + j);
    }
}
