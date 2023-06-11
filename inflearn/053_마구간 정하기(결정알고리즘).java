import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, c, arr));
    }

    public int distance(int[] arr, int dis) {
        int cnt=1, ep=arr[0];
        for (int x: arr) {
            if ((x-ep) >= dis) {
                cnt++;
                ep = x;
            }
        }
        return cnt;
    }

    public int solution(int size, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[size-1];

        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if (distance(arr, mid) >= c) {
                answer = mid;
                lt = mid+1;
            }
            else rt = mid-1;
        }
        return answer;
    }
}