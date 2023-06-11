class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        // b가 더 큰 경우 둘이 swap (안해주면 시간초과 발생)
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (true) {
            answer++;
            if ((a%2 == 1) && (b-a == 1)) break; // a가 홀수이면서, 둘의 차이가 1이면 만난거임
            
            a = (a+1)/2;
            b = (b+1)/2;
        }
        return answer;
    }
}