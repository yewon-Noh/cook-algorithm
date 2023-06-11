import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;   
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: numbers) {
            map.put(num, 1);
        }
        
        for (int i=0; i<=9; i++) {
            // numbers에 없는 경우 answer에 더함
            if (!map.containsKey(i)) answer += i;
        }
        return answer;
    }
}
