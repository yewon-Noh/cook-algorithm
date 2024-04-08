import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^A-Za-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}