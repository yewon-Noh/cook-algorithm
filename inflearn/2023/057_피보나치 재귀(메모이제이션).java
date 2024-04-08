public class Main {
    static int[] fibo;
    public int DFS(int n) {
        // 메모이제이션(memoization) 활용 (인터뷰 출제 유형)
        // - 이전에 계산한 값을 저장해놓고 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게함
        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args){
        Main T = new Main();
        int n= 45;
        fibo = new int[n+1];  // 1번 인덱스부터 사용용
        T.DFS(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }

    /**
     * 참고) for문/배열 vs 재귀함수 어떤게 더 성능이 좋은지?
     * - 당연히 for문/배열 사용하는 것
     */
}
