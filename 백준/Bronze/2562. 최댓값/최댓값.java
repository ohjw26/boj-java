import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            if(n > max) {
                max = n;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}