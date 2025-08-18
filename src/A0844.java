import java.util.Scanner;

public class A0844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0, f2 = 1, f3 = 1;
        if (n<2){
            System.out.println(n);
            return;
        }
        for (int i = 1; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);

    }
}
