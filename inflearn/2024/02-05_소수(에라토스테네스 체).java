import java.util.Scanner;

public class Main {
    /**
     * 에라토스테네스 체
     * - 소수가 되는 수의 배수를 지우면 남은 건 소수가 된다.
     */
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];    // default 0
        for (int i=2; i<=n; i++) {
            if (ch[i] == 0) {
                ch[i] = 1;
                answer++;
                // i 의 배수를 지움
                for (int j=i; j<=n; j+=i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}