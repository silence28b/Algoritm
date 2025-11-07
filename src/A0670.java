import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A0670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ind = 0;
        int num = 1;
        while (true){
            if (takrorlanmas(num)){
                ind++;
                if (ind==n){
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
    }
    static boolean takrorlanmas (int x){
        String s = String.valueOf(x);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) return false;
        }
        return true;
    }
}
