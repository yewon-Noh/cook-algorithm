import java.util.Scanner;

public class Main {
    public String solution(String str) {
        int maxIndex = 0, size = Integer.MIN_VALUE;
        String[] strArray = str.split(" ");

        for (int i=0; i<strArray.length; i++) {
            if (size < strArray[i].length()) {
                size = strArray[i].length();
                maxIndex = i;
            }
        }
        return strArray[maxIndex];
    }

    public String solution2(String str) {
        String answer = "";
        int size = Integer.MIN_VALUE;
        for (String s: str.split(" ")) {
            if (s.length() > size) {
                size = s.length();
                answer = s;
            }
        }
        return answer;
    }

    /**
     * 방법 3. indexOf, substring 사용
     * - indexOf(' ') : ' '를 발견 못하면 -1 반환
     * 
     */
    public String solution3(String str) {
        String answer = "";
        int size = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > size) {
                size = tmp.length();
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        // 마지막 단어 검사
        if (str.length() > size) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}