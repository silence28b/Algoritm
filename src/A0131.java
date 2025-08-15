import java.util.Scanner;

public class A0131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int indeks = -1;
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            int gender = sc.nextInt();

            if(gender == 1 && age > max){
                max = age;
                indeks = i + 1;
            }
        }
        System.out.println(indeks);
    }
}
