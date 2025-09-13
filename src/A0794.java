import java.util.Scanner;

public class A0794 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int qiz = n*(m/k);
        int oq = n*(k-1);
        if (m>=k){
            System.out.println(qiz + oq);
        }else {
            System.out.println(n*m);
        }
    }
}
