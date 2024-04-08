import java.util.*;

public class Main {
    static int[] pm, ch, arr;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {                      // 종착점이면 출력
            for (int x: pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i=0; i<n; i++) {
                if (ch[i] == 0) {          // 사용 안한 경우에만 
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);         
                    ch[i] = 0;             // 다시 돌아오면 체크를 해지해야함
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = in.nextInt();

        ch = new int[n];       // 사용 여부(중복 순열 방지)
        pm = new int[m];       // 순열 저장

        T.DFS(0);
    }
}