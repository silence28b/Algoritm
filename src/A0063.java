import java.util.Scanner;

public class A0063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int p = sc.nextInt();
        int[] result = new int[2];
        for (int x = 0; x <= 1000; x++) {
            int y = s - x;

            if (y>=1 && x * y == p){
                result[0] = Math.min(x,y);
                result[1] = Math.max(x,y);
                break;
            }
        }
        System.out.println(result[0]+ " " +result[1]);
       
    }
}
