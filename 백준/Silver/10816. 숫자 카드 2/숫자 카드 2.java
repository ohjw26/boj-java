import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(cards[i]); //숫자카드 N개
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] targets = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(targets[i]);
            bw.write(map.getOrDefault(num, 0) + " ");
        }

        bw.flush();
    }
}