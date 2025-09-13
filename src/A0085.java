import java.util.Scanner;

public class A0085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while (max != min ){
            if (max > min ){
                max = max - min;
            }else {
                min = min - max;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(1);
        }
    }
}
