import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for (int i=0; i<5; i++) {
            int num = in.nextInt();
            array[i] = num;
            sum += num;
        }
        Arrays.sort(array);
        
        System.out.println(sum/5);
        System.out.println(array[2]);
    }
}