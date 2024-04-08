import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * 방법 1. StringBuilder
     * - String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
     * - reverse() : 문자열을 뒤집음
     */
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    /**
     * 방법 2. 직접 뒤집기
     */
    public ArrayList<String> solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        for (String x: T.solution(str)) {
            System.out.println(x);
        }
    }
}