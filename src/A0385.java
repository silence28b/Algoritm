import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class A0385 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        TreeSet<Double> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double d = Math.sqrt((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]));
                set.add(d);
            }
        }
        System.out.println(set.size());
        for (double a : set){
            System.out.printf("%.12f%n", a);
        }
    }
}
