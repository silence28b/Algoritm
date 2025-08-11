import java.util.Scanner;

public class A0892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil = sc.nextInt();
        switch (yil){
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }
    }
}
