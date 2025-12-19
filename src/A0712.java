import java.util.Scanner;

public class A0712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong(), h= sc.nextLong(),n= sc.nextLong();
        long x = 0;
        long m = Long.MAX_VALUE;

        while (x*x<n){
            x++;
            long y =(n-1)/x+1;
            long a = Math.max(w*x,h*y);
            long b = Math.max(w*y,h*x);
            m=Math.min(m,Math.min(a,b));
        }
        System.out.println(m);
    }
}
