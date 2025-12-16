import java.util.Scanner;
public class A0354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        double x = Math.sqrt(n);
        while (i<=x){
            if (n%i==0){
                n/=i;
                System.out.print(i);
                if (n!=1) System.out.print("*");
            }else i++;
        }
        if (n!=1) System.out.print(n);
    }
}
