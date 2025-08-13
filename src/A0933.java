import java.util.Scanner;

public class A0933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (d>a){
            System.out.println((d-a)*c + a*b);
        } else {
            System.out.println(d*b);
        }
    }
}
