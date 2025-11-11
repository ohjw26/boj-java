import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        int count = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String person = br.readLine();
            //HashSet에 있으면 list에 추가
            if (set.contains(person)) {
                list.add(person);
                count ++; //듣보잡 수
            }
        }

        //list 사전순 정렬
        Collections.sort(list);

        bw.write(count + "\n");
        for (String name : list) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}