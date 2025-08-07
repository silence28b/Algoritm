import java.util.Scanner;

public class Kondyor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String run = sc.next();
        int m = Math.max(a, b);
        int n = Math.min(a, b);
        switch (run) {
            case "heat":
                System.out.println(m);
                break;
            case "freeze":
                System.out.println(n);
                break;
            case "fan":
                System.out.println(a);
                break;
            case "auto":
                System.out.println(b);
                break;
        }

    }
}
