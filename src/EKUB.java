import java.util.Scanner;

public class EKUB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int qol = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (min != 0) {
            qol = max % min;
            max = min;
            min = qol;
        }
        System.out.println(max);

    }
}