class Solution {
    int[][] matrix;
    
    public int rotate(int[] queries) {
        // 좌표
        int x1 = queries[0]-1;
        int y1 = queries[1]-1;
        int x2 = queries[2]-1;
        int y2 = queries[3]-1;
        
        // 시작지점 값 저장
        int start = matrix[x1][y2];
        int min = start;
        
        // 시계방향으로 회전
        // 상단
        for (int i=y2; i>y1; i--) {
            matrix[x1][i] = matrix[x1][i-1];
            if (matrix[x1][i] < min) min = matrix[x1][i];
        }
        // 좌측
        for (int i=x1; i<x2; i++) {
            matrix[i][y1] = matrix[i+1][y1];
            if (matrix[i][y1] < min) min = matrix[i][y1];
        }
        // 하단
        for (int i=y1; i<y2; i++) {
            matrix[x2][i] = matrix[x2][i+1];
            if (matrix[x2][i] < min) min = matrix[x2][i];
        }
        // 우측
        for (int i=x2; i>x1; i--) {
            matrix[i][y2] = matrix[i-1][y2];
            if (matrix[i][y2] < min) min = matrix[i][y2];
        }
        
        // 마지막 지점에 시작지점의 값 넣기
        matrix[x1+1][y2] = start;
        
        return min;
    }
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        // 행렬 초기화
        matrix = new int[rows][columns];
        int val = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                matrix[i][j] = val++;
            }
        }
        
        // 회전하고 이동한 숫자 중 최솟값을 저장
        for (int i=0; i<queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }
}