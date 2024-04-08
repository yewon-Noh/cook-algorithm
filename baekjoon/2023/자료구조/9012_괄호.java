import java.io.*;
import java.util.Stack;

public class Main {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push('(');
            else if (c == ')' && !stack.isEmpty()) stack.pop();
            else return "NO";
        }
        if (stack.isEmpty()) return "YES";
        return "NO";
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            bw.write(T.solution(s)+"\n");
        }
        bw.flush();
    }
}