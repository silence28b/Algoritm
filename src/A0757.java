import java.util.Scanner;

public class A0757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long min = Math.min(a/2 , Math.min(b/6 , c));
        if (a >=2 && b >= 6 && c >=1 ){
            System.out.println(min);
        }else {
            System.out.println(0);
        }
    }
}
