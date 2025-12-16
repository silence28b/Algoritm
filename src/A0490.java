import java.util.Scanner;
public class A0490 {
    static int days (String s) {
        int d = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int y = Integer.parseInt(s.substring(6, 8));
        int[] oy = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = d;
        if (y==94) sum+=365;
        for (int i = 0; i < m-1; i++) sum+=oy[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String petya = sc.nextLine().trim();
        String vasya = sc.nextLine().trim();
        int p = days(petya);
        int v = days(vasya);
        System.out.println(v-p);
    }
}
