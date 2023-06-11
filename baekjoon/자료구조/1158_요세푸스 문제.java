import java.util.*;

public class Main {
    public String solution(int n, int k) {
        String result = "<";
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) queue.offer(i);

        while (queue.size() > 1) {
            for (int i=1; i<k; i++) {
                queue.offer(queue.poll());
            }
            result += queue.poll() + ", ";
        }
        result += queue.poll() + ">";
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(T.solution(n, k));
    }
}