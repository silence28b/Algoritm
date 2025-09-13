import java.util.Scanner;
public class A0293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        double max =0;
        double s;
        int numb = 0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            s = (double) (a[i] * b[i]) /100;
            if (s>max){
                max = s;
                numb = i;
            }
        }
        System.out.println(numb+1);

    }
}
