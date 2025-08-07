import java.util.Scanner;

public class A0324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = n % 10;
        int a2 = (n / 10) % 10;
        int a3 = (n / 100) % 10;
        int a4 = (n / 1000) % 10;
        int s = a1 * 1000 + a2 * 100 + a3 * 10 + a4 * 1;
        if (n == s){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }

}
