import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int Y = N % H;
            int X = N / H + 1;

            if (Y == 0) {
                Y = H;
                X -= 1;
            }

            System.out.println(Y * 100 + X);
        }

    }
}
