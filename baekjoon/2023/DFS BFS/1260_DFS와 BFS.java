import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] nodes;  // 노드이 간선 표시

    static int N, M, V;

    public void DFS(int start) {
        // 재귀 이용
        check[start] = true;
        sb.append(start + " ");

        for (int i=1; i<=N; i++) {
            if (nodes[start][i] == 1 && !check[i]) DFS(i);
        }
    }

    public void BFS(int start) {
        // 큐 이용
        Queue<Integer> que = new LinkedList<>();

        que.offer(start);
        check[start] = true;

        while (!que.isEmpty()) {
            start = que.poll();
            sb.append(start + " ");

            for (int i=1; i<=N; i++) {
                if (nodes[start][i] == 1 && !check[i]) {
                    que.offer(i);
                    check[i] = true;
                }
            }
        }
    }


    public void solution() {
        // DFS 계산
        DFS(V);
        sb.append("\n");
        check = new boolean[N+1];
        // BFS 계산
        BFS(V);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        V = in.nextInt();

        nodes = new int[N+1][N+1];
        check = new boolean[N+1];

        // 인접행렬 이용
        for (int i=0; i<M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            nodes[a][b] = nodes[b][a] = 1;  // 간선은 양방향임
        }

        T.solution();
        System.out.println(sb);
    }
}