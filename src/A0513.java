import java.util.Scanner;
public class A0513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((long) (Math.pow(2, n)) - n - 1);
    }
}
