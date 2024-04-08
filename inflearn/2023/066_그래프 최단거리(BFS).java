import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;  // 연결 정보
    static int[] ch, dis;  // 방문 여부, 거리

    // 그래프 최단거리 구하기(BFS)
    public void BFS(int v) {
       Queue<Integer> queue = new LinkedList<>();
       ch[v] = 1;  // 1번 체크, 거리 설정
       dis[v] = 0;
       queue.offer(v);

       while (!queue.isEmpty()) {
           int cv = queue.poll(); // 현재 노드
           for (int nv : graph.get(cv)) {
               if (ch[nv] == 0) {  // 현재 방문 안한 것만
                   ch[nv] = 1;
                   queue.offer(nv);
                   dis[nv] = dis[cv] + 1;
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
        dis = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=1; i<=n; i++) System.out.println(i + " : " + dis[i]);
    }
}
