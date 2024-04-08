import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        char[] c = str.toUpperCase().toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (c[lt] != c[rt]) return "NO";
            lt++; rt--;
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "YES";
        str = str.toUpperCase();

        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) return "NO";
        }
        return answer;
    }

    /**
     * 방법 3
     * - str.equalsIgnoreCase(a) : 대소문자를 무시하고 같은지 확인
     */
    public String solution3(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}