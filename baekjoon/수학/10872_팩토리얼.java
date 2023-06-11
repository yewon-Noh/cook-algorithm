import java.util.Scanner;

public class Main {
    public int fact(int n) {
        if (n <= 1) return 1;
        else return n * fact(n-1);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.fact(n));
    }
}