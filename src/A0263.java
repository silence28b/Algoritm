import java.util.Scanner;

public class A0263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int birinchiyol;
        int ikkinchiyol;
        if (a < b) {
            birinchiyol = b - a - 1;
            ikkinchiyol = n - b + a - 1;
        } else {
            birinchiyol = a - b - 1;
            ikkinchiyol = n - a + b - 1;
        }
        System.out.println(Math.min(birinchiyol, ikkinchiyol));
    }
}
