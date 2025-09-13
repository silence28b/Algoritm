import java.util.Scanner;

public class Ekb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        long c = 0;
        while (min != max){
            c = max - min;
            max = Math.max(min, c);
            min = Math.min(min, c);

        }
        System.out.println(min);
    }
}
