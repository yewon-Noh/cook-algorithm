import java.util.Scanner;

public class Main {
    public String solution(int r, String s) {
        String answer = "";
        for (char c: s.toCharArray()) {
            for (int i=0; i<r; i++) {
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0; i<t; i++) {
            int r = in.nextInt();
            String s = in.next();
            System.out.println(T.solution(r, s));
        }
    }
}