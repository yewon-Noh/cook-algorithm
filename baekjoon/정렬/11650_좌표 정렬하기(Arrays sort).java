import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] point = new int[N][2];
        for (int i=0; i<N; i++) {
            point[i][0] = in.nextInt(); // x
            point[i][1] = in.nextInt(); // y
        }

        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1]; // y 오름차순 정렬
                return o1[0] - o2[0]; // x 오름차순 정렬
            }
        });

        for (int i=0; i<N; i++) {
            System.out.println(point[i][0] + " " + point[i][1]);
        }
    }
}