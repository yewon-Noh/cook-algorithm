import java.util.Scanner;

public class Main {
    public int solution(int n1, int n2) {
        // 최소공배수
        int lcm = n1 * n2 / gcd(n1, n2);
        return lcm;
    }
    // 최소공약수 계산
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
        int t = in.nextInt();
        for (int i=0; i<t; i++) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println(T.solution(n1, n2));
        }
    }
}