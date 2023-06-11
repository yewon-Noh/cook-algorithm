// 원소가 n개인 부분집합의 개수는 2^n개 이다.
public class Main {
    static int n;
    static int[] ch;  // 1: 사용함, 0: 사용안함
    public void DFS(int L) {
        if (L == n+1) {    // 종착점
            String tmp = "";
            for (int i=1; i<=n; i++) {
                if (ch[i] == 1) tmp += i + " ";
            }
            if (tmp.length() > 0) System.out.println(tmp);    // 공집합이 아닐때만 출력함
        }
        else {
            ch[L] = 1;
            DFS(L+1);  // 왼쪽으로 뻗음(사용o)

            ch[L] = 0;
            DFS(L+1);  // 오른쪽으로 뻗음(사용x)
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        n = 3;
        ch = new int[n+1];  // 0번 인덱스 사용안함
        T.DFS(1);
    }
}