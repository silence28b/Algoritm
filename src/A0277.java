import java.util.Scanner;
public class A0277 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        if (a==0 && b==0 && c==0){
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (a!=0) sb.append(a);
        if (b != 0) {
            if (!sb.isEmpty() && b>0) sb.append("+");
            if (b==-1) sb.append("-x");
            else if (b==1) sb.append("x");
            else sb.append(b).append("x");
        }
        if (c != 0) {
            if (!sb.isEmpty() && c>0) sb.append("+");
            if (c==-1) sb.append("-y");
            else if (c==1) sb.append("y");
            else sb.append(c).append("y");
        }
        System.out.println(sb);
    }
}
