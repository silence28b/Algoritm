import com.sun.jdi.LongValue;

import java.util.Scanner;

public class A0003 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if (a == 5){
            System.out.println(25);
        }
        String son = String.valueOf(a);
        long n = Long.valueOf(son.substring(0,son.length()-1));
        System.out.print(n * (n +1));
        System.out.print(25);

    }
}
// qabul qilinmagan lekin organsa boladi
// togri javob oddiy kv kotarishni long bn yozish
