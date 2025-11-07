import java.util.Scanner;

public class A0059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        int sk=1;
        int sy = 0;
        while (x>0){
            sy += x%k;
            sk*=x%k;
            x/=k;
        }
        System.out.println(sk-sy);
    }
}
