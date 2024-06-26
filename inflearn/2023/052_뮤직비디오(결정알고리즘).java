import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, m, arr));
    }

    public int count(int[] arr, int capacity) {
        int cnt=1, sum=0; // sum : 현재 DVD에 노래가 몇분 저장되어 있는지
        for (int x: arr) {
            if ((sum+x) > capacity) {
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }

    public int solution(int size, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        // 이분 검색
        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }
        return answer;
    }
}