import java.util.Scanner;

public class kubiktenglama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        for (int i = -100; i <= 100; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0){
                System.out.print( i + " ");
            }

        }
    }
}
