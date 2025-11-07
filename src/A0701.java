import java.util.Scanner;

public class A0701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();
        System.out.println(Integer.parseInt(k, n%10+2));
    }
}
