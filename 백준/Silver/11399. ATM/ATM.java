import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        String[] inpput = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(inpput[i]);
        }

        Arrays.sort(time);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            sum += time[i];
            result += sum; //누적 합
        }
        bw.write(result + "\n");
        bw.flush();
    }
}