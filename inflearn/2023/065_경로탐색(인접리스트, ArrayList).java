import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;  // 연결 정보
    static int[] ch;  // 방문 여부

    // 정점의 개수가 많은 경우에는 인접행렬은 매우 비효율적임
    // --> 이럴 때 인접리스트를 사용!
   public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv: graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0; // 다시 돌아오면 체크 해지
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);    // 갈 수 있는 노드들만 있게 됨
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}