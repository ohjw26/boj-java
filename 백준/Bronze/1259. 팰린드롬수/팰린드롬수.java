import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int reverse = 0;
            int original = n;

            while(n > 0) {
                reverse = reverse * 10 + n % 10;
                n = n / 10;
            }
            //System.out.println(reverse);
            if (original == reverse) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}