import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] person = br.readLine().split(" ");
            list.add(person);
        }

        list.sort((a, b) -> {
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        for (String[] person : list) {
            bw.write(person[0] + " " + person[1] + "\n");
        }

        bw.flush();
    }
}
