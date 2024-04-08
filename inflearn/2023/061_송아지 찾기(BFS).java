import java.util.*;
public class Main {
    int L = 0;
    int[] dis = {1, -1, 5};
    int[] ch; //한번 방문한 노드는 다시 방문하지 않도록 하기 위함
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        Q.offer(S);

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i=0; i<len; i++) {
                int x = Q.poll();

                // 현재 노드에서 1, -1, 5씩 이동한 노드를 만들어준다.
                for (int j: dis) {
                    int nx = x+j;
                    if (nx == E) return ++L;  // 만약 해당 위치에 도착하면 결과를 반환한다.
                    if (nx >=1 && nx <=10000 && ch[nx] == 0) {
                        // 이동한 값이 범위 내 이면서 방문 안한 경우에만 수행
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++; // 레벨 증가
        }
        return L;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.println(T.BFS(S, E));
    }
}