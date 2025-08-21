import java.util.Scanner;

public class A0013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int buqalar = 0;
        int sigrlar = 0;
        for (int i = 0; i < 4; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                buqalar++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j && a.charAt(i) == b.charAt(j)) {
                    sigrlar++;
                }
            }
        }
        System.out.println(buqalar+ " "+sigrlar );

    }
}
