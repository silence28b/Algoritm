import java.util.Scanner;

public class A0521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k = sc.nextInt();
        int tm = 0;
        for (int i = p; i <=k ; i++) {
            int x = i;
            int movs = 0;
            while (x!=2){
                if (x%2==0){
                    x/=2;
                    movs++;
                }else {
                    x=3*x+1;
                    movs++;
                }
            }
            tm+=movs;
        }
        System.out.println(tm);
    }
}
