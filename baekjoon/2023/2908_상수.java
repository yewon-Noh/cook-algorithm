import java.util.Scanner;

public class Main {
    public int solution(int n1, int n2) {
        int reversed1 = reverseInt(n1);
        int reversed2 = reverseInt(n2);

        if (reversed1 > reversed2) return reversed1;
        else return reversed2;
    }

    public int reverseInt(int n) {
        int result = 0;
        while (n!=0) {
            result = result * 10;
            result = result + n%10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(T.solution(n1, n2));
    }
}