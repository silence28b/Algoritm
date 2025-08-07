import java.util.Scanner;

public class Spirt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long C = a / 2 ;
        long H = b / 6;
        long O = c / 1;
        System.out.println(Math.min(C,Math.min(H,O)));

    }
}
