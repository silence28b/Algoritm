import java.util.Arrays;
import java.util.Scanner;
public class A0686 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        int[] x = new int[n];
        int a = 0, b = n-1, i=0;
        while (i<n){
            if (i%2==0){
                x[a] = s[i];
                a++;
            }else {
                x[b] = s[i];
                b--;
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(x[j]+" ");
        }
    }
}
