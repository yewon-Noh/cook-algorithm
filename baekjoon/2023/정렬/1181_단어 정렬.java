import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0; i<N; i++) {
            String str = in.next();  // nextLine()을 사용하면 앞에 N을 입력한 후 <Enter>값이 0번째 값으로 들어가게 된다.
            if (!arrayList.contains(str)) arrayList.add(str);
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);  // o1과 o2의 아스키코드 값을 비교한다.(사전 순 정렬)
                return o1.length() - o2.length();
            }
        });
        for (String a: arrayList) System.out.println(a);
    }
}