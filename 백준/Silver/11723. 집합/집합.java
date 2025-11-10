import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            if(cmd.equals("add")) {
                int x = Integer.parseInt(input[1]);
                set.add(x);
            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(input[1]);
                set.remove(x);
            } else if (cmd.equals("check")) {
                //결과출력
                int x = Integer.parseInt(input[1]);
                bw.write(set.contains(x) ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(input[1]);
                if(set.contains(x)) {
                    set.remove(x);
                } else {
                    set.add(x);
                }
            } else if (cmd.equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (cmd.equals("empty")) {
                set.clear();
            }
        }
        bw.flush();
    }
}