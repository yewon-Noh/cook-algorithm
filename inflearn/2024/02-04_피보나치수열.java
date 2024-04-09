import java.util.Scanner;

public class Main {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i=2; i<n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }

    /**
     * 방법 2. 배열 미사용
     */
    public void solution2(int n) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n; i++) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i: T.solution(n)) System.out.print(i + " ");
    }
}