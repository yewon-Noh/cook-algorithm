import java.util.Scanner;

public class Main {
    /**
     * 풀이 방법
     * - 뒤에서부터 0의 개수는 10의 배수를 의미한다. 여기서 10 = 2*5이다.
     * - 이때 2는 무조건 5보다 많이 나오기 때문에 5의 개수를 알면 -> 10의 개수 -> 0의 개수를 알 수 있다.
     * - 즉 1부터 n까지의 곱 중에 5의 배수로 나눠지는 것이 몇개인지 구하면 된다.
     */
    public int solution(int n) {
        int count = 0;
        while (n >= 5) {
            count += n/5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}