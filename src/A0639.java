import java.util.*;

public class A0639 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Map<String, Object>> users = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int usersCount = Integer.parseInt(sc.nextLine());

            for (int j = 0; j <usersCount ; j++) {
                String[] s = sc.nextLine().split(" ");
                double bal = Double.parseDouble(s[0]);
                String name = s[1];

                Map<String, Object> user = new HashMap<>();
                user.put("bal", bal);
                user.put("name", name);
                users.add(user);
            }
        }
        Collections.sort(users, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Double o1Bal = (Double) o1.get("bal");
                Double o2Bal = (Double) o2.get("bal");

                return Double.compare(o2Bal, o1Bal);
            }
        });
        System.out.println(users.size());
        for (Map<String,Object> user : users) {
            System.out.printf("%.2f %s\n", (double) user.get("bal"), user.get("name"));
            
        }

    }
}
