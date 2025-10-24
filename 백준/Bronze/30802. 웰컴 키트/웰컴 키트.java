import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //참가자 수
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = sc.nextInt(); //사이즈별 신청자 수
        }
        int T = sc.nextInt(); //티셔츠 묶음 수
        int P = sc.nextInt(); //펜 묶음 수

        int T_count = 0;
        for (int i = 0; i < size.length; i++) {
            if(size[i] > 0 && size[i] <= T) {
                T_count++;
            } else if (size[i] % T ==0) {
                T_count += size[i] / T;
            } else if (size[i] > T) {
                T_count += size[i] / T + 1;
            } else {
                continue;
            }
        }
        System.out.println(T_count);
        System.out.println(N / P + " " + N % P);

    }
}
