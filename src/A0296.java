import java.util.Scanner;

public class A0296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lisa = 0;
        int kot = 0;
        if (n%5==0){
            System.out.println(n/5 + " "+ 0);

        }else {
            for (int i = n / 5; i >= 0; i--) {
                int x = n - (i * 5);
                if (x % 3 == 0) {
                    kot = i;
                    lisa = x/3;
                    break;
                }
            }
            System.out.println(kot + " " + lisa);
        }
    }
}
