import java.util.Scanner;

public class A0529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double d = Math.sqrt( (Math.pow((a2 - a1),2) + Math.pow((b2 - b1),2)) );
        System.out.println(d);
    }
}
