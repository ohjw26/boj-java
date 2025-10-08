import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;
        int[] count = new int[10];

        while (mul > 0) {
            int num = mul % 10;
            count[num] ++;
            mul /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}