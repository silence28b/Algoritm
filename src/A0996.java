import java.util.HashSet;
import java.util.Scanner;
public class A0996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        a[1] = 1;
        HashSet<Integer> bormi = new HashSet<>();
        bormi.add(1);
        for (int i = 2; i <=n ; i++) {
            if (bormi.contains(i)) a[i] = a[i-1]+3;
            else a[i] = a[i-1] + 2;
            bormi.add(a[i]);
        }
        System.out.println(a[n]);
    }
}
