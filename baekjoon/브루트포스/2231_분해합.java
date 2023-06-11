import java.util.*;

public class Main {
    public int solution(int N) {
        for (int i=1; i<N; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number%10;
                number /= 10;
            }

            if (sum + i == N) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(T.solution(N));
    }
}