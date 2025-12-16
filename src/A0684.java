import java.util.Scanner;

public class A0684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x1 = s.charAt(0)-'a'+1;
        int x2 = s.charAt(1)-'0';
        int y1 = s.charAt(3)-'a'+1;
        int y2 = s.charAt(4)-'0';
       if (y2<=x2){
           System.out.println("NO");
           return;
       }
       if (Math.abs(y1-x1) == Math.abs(y2-x2)){
           System.out.println("YES");
           return;
       }
       int dx = Math.abs(y1-x1);
       int dy = Math.abs(y2-x2);
       if (dy>dx && (dy-dx)%2==0){
           System.out.println("YES");
       }else {
           System.out.println("NO");
       }
    }
}
