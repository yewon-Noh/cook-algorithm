import java.util.*;
public class Main {

    public char solution(String S) {
        char answer = '?';
        int[] arr = new int[26]; // 알파벳 개수만큼 배열 선언
        int max = -1;

        S = S.toUpperCase(); // 모두 대문자로 변경
        for (int i=0; i<S.length(); i++) {
            int index = S.charAt(i) - 65;

            arr[index]++; // 대문자 알파벳의 아스키코드는 65부터 시작임
            if (max < arr[index]) {
                max = arr[index];
                answer = S.charAt(i);

            } else {
                if (max == arr[index]) answer = '?';
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}