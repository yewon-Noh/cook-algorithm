import java.util.Scanner;

public class Main {
    public int solution(int n1, int n2) {
        // 최소공배수
        int lcm = n1 * n2 / gcd(n1, n2);
        return lcm;
    }
    // 최소공약수 계산
    public int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x%y);
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