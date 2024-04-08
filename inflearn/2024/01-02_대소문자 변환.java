import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for (char x: str.toCharArray()) {
            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        return answer;
    }

    /**
     * 방법 2. 아스키코드 값 이용
     * - 소문자 a ~ z : 97 ~ 122
     * - 대문자 A ~ Z : 65 ~ 90
     */
    public String solution2(String str) {
        String answer = "";
        for (char x: str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}