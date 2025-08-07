import java.util.Scanner;

public class A0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x) {
            case 1, 12, 2:
                System.out.println("WINTER");
                break;
            case 3, 4, 5:
                System.out.println("SPRING");
                break;
            case 6, 7, 8:
                System.out.println("SUMMER");
                break;
            case 9, 10, 11:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("ERROR");

        }

    }
}
