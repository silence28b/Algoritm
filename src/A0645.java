import java.util.Scanner;

public class A0645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int min = k;
        int m = 0;
        int n = 0;
        for (int h = 1; h <= k; h++) {
            int w = k / h;
            int j = (k - w * h) + Math.abs(w - h);
            if (min>j){
                min=j;
                m=w;
                n=h;
            }
        }
        System.out.println(n+" "+m);

    }
}
