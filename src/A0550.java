import java.util.Scanner;

public class A0550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String str = Integer.toString(year);
        if (year < 10) {
            str = "000" + str;
        } else if (year < 100) {
            str = "00" + str;
        } else if (year < 1000) {
            str = "0" + str;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("12/09/" + str);
        } else {
            System.out.println("13/09/" + str);
        }

    }
}
