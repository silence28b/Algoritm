import java.util.Scanner;

public class A0576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        if(n==1){
            System.out.println(0);
            return;
        }

        for (int i = n - 1; i > 1; i--) {
            int a = n;
            int b = i;
            int qol = 0;
            while (b != 0) {
                qol = a % b;
                a = b;
                b = qol;
            }
            if (a==1){
                s++;
            }
        }
        System.out.println(s);

    }
}
