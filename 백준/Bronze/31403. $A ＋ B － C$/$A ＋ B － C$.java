import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A+B-C);

        String AB = String.valueOf(A) + String.valueOf(B);
        System.out.println(Integer.parseInt(AB) - C);
        //String.valueof() : 정수를 문자열로 변환
        //Integer.parseInt() : 문자열을 정수로 변환
    }
}