import java.util.Scanner;

public class A0778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = 0;

        for (int i = 0; i < 31; i++) {
            all += sc.nextInt();
        }
        System.out.println(all/27);
    }
}
