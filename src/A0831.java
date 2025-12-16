import java.util.Scanner;

public class A0831 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int max = 0;
        int son =0;
        int tb =0;
        for (int i = a; i <= b; i++) {
            if (tubMa(i)){
               tb++;
                if (suM(i)>=max){
                    max =suM(i);
                    son=i;
                }
            }
        }
        if (tb>0) System.out.println(son);
        else System.out.println(-1);

    }
    static int suM (int y){
        int sum = 0;
        String sy = Integer.toString(y);
        for (char c : sy.toCharArray()){
            sum+=c-'0'-1;
        }
        return sum;
    }
    static boolean tubMa(int x) {
        if (x < 2 || x > 2 && x % 2 == 0) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
