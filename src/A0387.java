import java.util.Scanner;

public class A0387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        int s = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].charAt(0) == list[i].charAt(3)) {
                s++;
            }
        }
        System.out.println(s);
    }
}

