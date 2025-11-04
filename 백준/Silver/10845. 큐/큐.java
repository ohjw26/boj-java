import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer((br.readLine()));
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                queue.offer(x); //큐의 마지막에 정수 x 추가
                last = x; //마지막 값
            } else if (cmd.equals("pop")) {
                bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");
            } else if (cmd.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd.equals("empty")) {
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (cmd.equals("front")) {
                bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n");
            } else if (cmd.equals("back")) {
                bw.write((queue.isEmpty() ? -1 : last) + "\n");
            }
        }

        bw.flush();
    }
}