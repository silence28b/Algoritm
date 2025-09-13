import java.util.Scanner;

public class A0924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rang = new String[4];
        for (int i = 0; i < 4; i++) {
            rang[i] = sc.next();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char n = rang[i].charAt(j);
                if (rang[i].charAt(j + 1) == n &&
                        rang[i + 1].charAt(j) == n &&
                        rang[i + 1].charAt(j + 1) == n) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");

    }
}
