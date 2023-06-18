import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Integer[] arr = new Integer[str.length()];
        for (int i=0; i<str.length(); i++) arr[i] = Integer.valueOf(str.charAt(i)-48);  // 숫자 0의 아스키코드는 48임

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int x: arr) System.out.print(x);
    }
}