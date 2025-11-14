import java.util.Scanner;
public class A0785_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt(), b = sc.nextInt();
         for (int i = a; i <= b; i++) {
             long x = (long) i * i;
             String s = String.valueOf(i);
             String sx = String.valueOf(x);
             if (sx.endsWith(s)) {
                 System.out.print(i + " ");
             }
         }
    }
}

