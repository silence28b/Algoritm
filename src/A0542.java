import java.util.Scanner;

public class A0542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        //  Ikkilik ko‘rinishga o‘tkazamiz
        String binary = Integer.toBinaryString(m);
        //  Teskari qilib olamiz
        String reversed = new StringBuilder(binary).reverse().toString();
        //  Teskari binary ni o‘nlikka o‘tkazamiz
        int result = Integer.parseInt(reversed, 2);
        System.out.println(result);

    }
}
