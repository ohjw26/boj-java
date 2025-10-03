import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calc(a, b);
        System.out.println(result);
    }
    public static int calc(int a, int b){
        return (a + b) * (a - b);
    }
}