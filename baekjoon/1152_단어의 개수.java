import java.util.Scanner;

public class Main {
    public int solution(String S) {
        int count = 0;
        for (String s : S.split(" ")) {
            if (s.replaceAll(" ", "").length() > 0) count++;
        }
        return count;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}