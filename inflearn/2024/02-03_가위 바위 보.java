import java.util.Scanner;

public class Main {
    public char[] solution(int n, int[] A, int[] B) {
        char[] answer = new char[n];
        for (int i=0; i<n; i++) {
            if (A[i] == 1) {
                if (B[i] == 1) answer[i] = 'D';
                else if (B[i] == 2) answer[i] ='B';
                else answer[i] = 'A';
            } else if (A[i] == 2) {
                if (B[i] == 1) answer[i] = 'A';
                else if (B[i] == 2) answer[i] ='D';
                else answer[i] = 'B';
            } else {
                if (B[i] == 1) answer[i] = 'B';
                else if (B[i] == 2) answer[i] ='A';
                else answer[i] = 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i=0; i<n; i++) A[i] = sc.nextInt();
        for (int i=0; i<n; i++) B[i] = sc.nextInt();
        for (char c: T.solution(n, A, B)) System.out.println(c);
    }
}