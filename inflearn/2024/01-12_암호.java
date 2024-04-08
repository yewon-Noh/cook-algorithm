import java.util.Scanner;

public class Main {
    /**
     * -  parseInt(string, 2) : 2진수를 10진수로 변환
     * - replace(char old, char new) : old 문자를 new 문자로 바꿈
     */
    public String solution(String str, int n) {
        String answer = "";
        for (int i=0; i<n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str, n));
    }
}