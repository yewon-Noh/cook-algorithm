import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int a = in.nextInt();
            if (!arrayList.contains(a)) arrayList.add(a);
        }
        Collections.sort(arrayList);
        for (int a: arrayList) System.out.print(a + " ");

    }
}
