import java.util.Scanner;

public class A0798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if ((n*m)%2==0){
            System.out.println("equal");
        } else if ((x+y)%2==0) {
            if (r==0) {
                System.out.println("black");
            } else if (r==1) {
                System.out.println("white");
            }
        } else if ((x+y)%2!=0){
            if (r==0){
                System.out.println("white");
            } else if (r==1) {
                System.out.println("black");
            }
        }

    }
}
