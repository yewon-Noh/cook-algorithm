import java.util.Scanner;

public class Main {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        // 왼쪽 기준으로 계산
        int p = 1000;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) p = 0;
            else p++;
            answer[i] = p;
        }

        // 오른쪽 기준으로 한번 더 계산
        p = 1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == c) p = 0;
            else p++;
            answer[i] = Integer.min(answer[i], p);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x: T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}