import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A0250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isBinary(n)){
            System.out.println(n);
            return;
        }
        int down = n-1;
        while (down>=1 && !isBinary(down)) down--;
        int up = n+1;
        while (up<=30000 && !isBinary(up)) up++;
        int disdown = (down>=1)? n-down : Integer.MAX_VALUE;
        int disup = (up<=30000)? up-n : Integer.MAX_VALUE;
        if (disdown <= disup){
            System.out.println(down);
        }else {
            System.out.println(up);
        }
    }
    static boolean isBinary(int x) {
        Set<Character> s = new HashSet<>();
        for (char c : String.valueOf(x).toCharArray()) s.add(c);
        return s.size() <= 2;
    }
}
