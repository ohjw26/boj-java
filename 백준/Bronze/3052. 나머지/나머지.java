import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        HashSet<Integer> mod = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
            mod.add(arr[i] % 42);
        }

        System.out.println(mod.size());
    }
}