import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer((br.readLine()));
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x); //스택에 정수 x를 push
            } else if (cmd.equals("pop")) {
                bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
            } else if (cmd.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (cmd.equals("empty")) {
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
            } else if (cmd.equals("top")) {
                bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
            }
        }

        bw.flush();
    }
}