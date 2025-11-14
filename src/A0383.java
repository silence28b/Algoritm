import java.util.Scanner;

public class A0383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int i = 1;
        while (true) {
            String x = String.valueOf(i);
            int y = 0;
            for (int j = 0; j < x.length(); j++) {
                y+=x.charAt(j)-'0';
            }
            if (y%x.length()==0){
                s++;
               if (s==n){
                   System.out.println(i);
                   break;
               }
            }
            i++;
        }
    }
}
