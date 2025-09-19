import java.util.Scanner;

public class A0843 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = (n - c) - b;
        int y = (n - c) - a;
        int z = (n - c) - (x + y);
        System.out.println(z + " " + x + " " + y);


    }
}
