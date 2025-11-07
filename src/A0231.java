import java.util.Scanner;

public class A0231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int digit = 0;
        StringBuilder sb = new StringBuilder();
        int index =0;
        for (char c : s) {
            if (Character.isDigit(c)){
                digit=digit*10+(c-'0');
            }else {
                if (digit==0){
                    index = append(sb, c, index);
                }else {
                    for (int i = 0; i < digit; i++) {
                        index = append(sb, c, index);

                    }
                }
                digit=0;
            }
        }
        System.out.println(sb);

    }
    private static int append (StringBuilder sb, char c, int index){
        if (index==40){
            sb.append('\n');
            index =0;
        }
        sb.append(c);
        return ++index;
    }
}
