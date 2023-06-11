import java.util.*;

public class Main {
    static int[] fn = new int[11];

    public static void factory() {
        fn[0] = 1;
        fn[1] = 2;
        fn[2] = 4;

        for (int i=3; i<11; i++) {
            fn[i] = fn[i-1] + fn[i-2] + fn[i-3];
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        factory(); // 미리 11까지 구해둠
        
        int N = in.nextInt();
        for (int i=0; i<N; i++) {
            int n = in.nextInt();
            System.out.println(fn[n-1]);
        }
    }
}