import java.util.Scanner;

public class A0854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String soz = sc.next();
        switch (soz){
            case "freeze":
                System.out.println(Math.min(a,b));
                break;
            case "heat":
                System.out.println(Math.max(a,b));
                break;
            case "auto":
                System.out.println(b);
                break;
            case "fan":
                System.out.println(a);
                break;
        }
    }
}
