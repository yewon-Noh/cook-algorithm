import java.util.*;

public class Main {
    public int solution(int N, int M, int[] arr) {
        int result = 0;

        // 3중 for문을 위해 구할 수 있음
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int z=j+1; z<N; z++) {
                    int sum = arr[i] + arr[j] + arr[z];
                    if (sum == M) return sum;
                    else if ((sum < M) && (sum > result)) result = sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<N; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(N, M, arr));
    }
}