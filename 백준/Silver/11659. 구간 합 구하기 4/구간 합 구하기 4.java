import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] nums = br.readLine().split(" "); //N개의 수
        int[] arr = new int[N]; //누적합 배열

        arr[0] = Integer.parseInt(nums[0]);
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(nums[i]);
        }

        for (int i = 0; i < M; i++) {
            String[] section = br.readLine().split(" "); //구간
            int start = Integer.parseInt(section[0]);
            int end = Integer.parseInt(section[1]);

            int sum = 0;
            if (start == 1) {
                sum = arr[end - 1];
            }else {
                sum = arr[end - 1] - arr[start - 2];
            }
            bw.write(sum + "\n");
        }

        bw.flush();
    }
}