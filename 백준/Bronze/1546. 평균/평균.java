import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] score = new double[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextDouble();
        }

        double max = score[0];
        for (int i = 0; i < N; i++) {
            if(score[i] > max){
                max = score[i];
            }
        }
        
        double score_sum = 0;
        for (int i = 0; i < N; i++) {
            score_sum += (score[i] / max * 100);
        }

        System.out.println(score_sum / N);
    }
}