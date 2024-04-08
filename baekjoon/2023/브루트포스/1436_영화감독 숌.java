import java.util.*;

public class Main {
    public int solution(int N) {
        if (N == 1) return 666;  // 첫번째면 그냥 666을 반환한다.
        
        int name = 666;
        for (int i=2; i<=N; i++) {
            boolean check = false;
            while (!check) {
                // 조건에 맞는 name을 만들때까지 반복한다.
                name++;
                if (String.valueOf(name).contains("666")) check = true;
            }
        }
        return name;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(T.solution(N));
    }
}