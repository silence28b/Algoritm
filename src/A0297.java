import java.util.Scanner;

public class A0297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == '0' || n.charAt(i) == '6' || n.charAt(i) == '9'){
                sum ++;
            } else if (n.charAt(i) == '8') {
                sum += 2;

            }


        }
        System.out.println(sum);
    }
}
