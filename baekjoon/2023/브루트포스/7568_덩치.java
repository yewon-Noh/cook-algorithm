import java.util.*;

public class Main {
    public int[] solution(int N, int[][] arr) {
        int[] result = new int[N];

        for (int i=0; i<N; i++) {
            int x = arr[i][0], y = arr[i][1];
            int cnt = 0;  // 자신보다 덩치 큰 사람의 수
            for (int j=0; j<N; j++) {
                // 자기자신은 안함
                if (i == j) continue;
                if (x < arr[j][0] && y < arr[j][1]) cnt++;
            }
            result[i] = cnt + 1; // 등수=cnt+1
        }

        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][2];
        for (int i=0; i<N; i++) {
            arr[i][0] = in.nextInt(); // 몸무게
            arr[i][1] = in.nextInt(); // 키
        }
        for (int i : T.solution(N, arr))
            System.out.print(i + " ");
    }
}