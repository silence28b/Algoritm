import java.util.Scanner;
public class A0395 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum =0;
        for (int i = a; i <=b ; i++) {
            String s = String.valueOf(i);
            int kop = 1;
            for (char c : s.toCharArray()){
                kop *= c - '0';
            }
            if (kop != 0 && i % kop ==0) sum++;
        }
        System.out.println(sum);
    }
}
