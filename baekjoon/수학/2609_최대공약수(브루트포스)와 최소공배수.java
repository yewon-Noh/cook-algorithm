import java.util.Scanner;

public class Main {
    public void solution(int n1, int n2) {
        // 최대공약수 - 브루트포스 사용
        int gcd = gcd(n1, n2);
        System.out.println(gcd);

        // 최소공배수
        int lcm = n1 * n2 / gcd;
        System.out.println(lcm);
    }
    public int gcd(int n1, int n2) {
        int min_num = (n1<n2) ? n1 : n2;
        for (int i=min_num; i>0; i--) {
            if ((n1%i==0) && (n2%i==0)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        T.solution(n1, n2);
    }
}