import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        // "("일때 push, ")"일때 pop
        //스택이 비었는데 ")" 이 나오거나 스택에 "("이 남았을 때 NO
        //스택이 비었을때 YES
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean isValid = true;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isValid && stack.empty()) {
                bw.write("YES\n");
            }
            else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}