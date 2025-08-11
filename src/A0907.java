import java.util.Scanner;

public class A0907 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        if (a>=2*r && b>=2*r){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
