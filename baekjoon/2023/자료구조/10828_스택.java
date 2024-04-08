import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push")) {
                stack.push(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop")) {
                if (stack.isEmpty()) bw.write(-1+"\n");
                else bw.write(stack.pop()+"\n");
            } else if (s[0].equals("size")) {
                bw.write(stack.size()+"\n");
            } else if (s[0].equals("empty")) {
                if (stack.isEmpty()) bw.write(1+"\n");
                else bw.write(0+"\n");
            } else if (s[0].equals("top")) {
                if (stack.isEmpty())  bw.write(-1+"\n");
                else bw.write(stack.peek()+"\n");
            }
        }
        bw.flush();
    }
}