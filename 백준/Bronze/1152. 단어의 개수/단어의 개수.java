import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String str = sc.nextLine().trim();

        if(str.isEmpty()){
            System.out.println(0);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println(count + 1);
        }
    }
}