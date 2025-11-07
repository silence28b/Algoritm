import java.util.Scanner;
public class A0231_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            // Raqamni yig‘amiz (agar bor bo‘lsa)
            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }
            // Harfni o‘qib olamiz
            if (i < input.length() && Character.isUpperCase(input.charAt(i))) {
                char ch = input.charAt(i);
                i++;

                if (count == 0) count = 1; // Agar raqam yo‘q bo‘lsa

                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }
            }
        }
        // 40 belgilik satrlarga bo‘lamiz
        for (int j = 0; j < result.length(); j += 40) {
            int end = Math.min(j + 40, result.length());
            System.out.println(result.substring(j, end));
        }

    }
}
