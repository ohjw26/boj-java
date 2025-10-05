import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            int nums = sc.nextInt();

            if (nums > max) max = nums;
            if (nums < min) min = nums;
        }
        System.out.println(min + " " + max);
    }
}