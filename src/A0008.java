import java.util.Scanner;

public class A0008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();
        int m = a1+a2+a3+a4;
        int n = b1+b2+b3+b4;
        if (m>n){
            System.out.println(1);
        } else if (n>m) {
            System.out.println(2);

        }else {
            System.out.println("DRAW");
        }
    }
}
