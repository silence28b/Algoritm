import java.util.Scanner;

public class A0543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        int d = sc.nextInt(), p = sc.nextInt();
        int l = n-1;
        int kg = (((1+l)*l)/2)*w;
        if (kg==p) System.out.println(n);
        else System.out.println((kg-p)/d);
    }
}
