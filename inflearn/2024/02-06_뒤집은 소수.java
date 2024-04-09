import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int[] n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i: n) {
            int res = reverse(i);
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    /**
     * 숫자를 뒤집는 함수
     *
     * @param n
     * @return
     */
    public int reverse(int n) {
        int res = 0;
        while (n != 0) {
            res = (res * 10) + (n % 10);
            n /= 10;
        }
        return res;
    }

    /**
     * 소수인지 검사하는 함수
     *
     * @param n
     * @return
     */
    public boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i=2; i<n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        for (int i: T.solution(arr)) System.out.print(i + " ");
    }
}