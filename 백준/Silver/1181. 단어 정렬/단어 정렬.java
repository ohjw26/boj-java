import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 사전순 정렬
            }
            return a.length() - b.length(); // 길이순 정렬
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}
