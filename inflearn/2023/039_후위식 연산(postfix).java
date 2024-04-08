import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x: str.toCharArray()) {
            if (Character.isDigit(x))  stack.push(x-48);  //Character.getNumericValue(x)
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt-rt);
                else if (x == '*') stack.push(lt*rt);
                else if (x == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
}