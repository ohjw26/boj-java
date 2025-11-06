import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int last = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > last) {
                for (int j = last + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last = num;
            } else {
                if (stack.isEmpty() || stack.peek() != num) {
                    System.out.println("NO\n");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}