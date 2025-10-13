import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String quiz = sc.next();
            int combo = 0;
            int score = 0;
            
            for (int j = 0; j < quiz.length(); j++) {
                if(quiz.charAt(j) == 'O') {
                    combo++;
                    score += combo;
                } else if (quiz.charAt(j) == 'X') {
                    combo = 0;
                }
            }
            System.out.println(score);
        }
    }
}