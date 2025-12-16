import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A0689_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int bestBase = 2;
            String bestRep = "";
            int bestScore = Integer.MAX_VALUE;
            for (int base = 2; base <= 36; base++) {
                String rep = Integer.toString(x, base).toUpperCase();
                int length = rep.length();
                Set<Character> set = new HashSet<>();
                for (char c : rep.toCharArray()) set.add(c);
                int ozgaruvchi = set.size();
                int score = length + ozgaruvchi;
                if (score < bestScore) {
                    bestScore = score;
                    bestBase = base;
                    bestRep = rep;
                }
            }
            System.out.println(bestBase + " " + bestRep);
        }
    }
}
