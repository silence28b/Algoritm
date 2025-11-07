import java.util.Scanner;
public class A0641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String maxVal = "";
        for (int i = 0; i<s.length(); i++){
            for (int j = i+1; j < s.length(); j++) {
                String cut = s.substring(0,i)+s.substring(i+1,j)+s.substring(j+1);
                if (cut.compareTo(maxVal)>0){
                    maxVal=cut;
                }
            }
        }
        System.out.println(maxVal);

    }
}
