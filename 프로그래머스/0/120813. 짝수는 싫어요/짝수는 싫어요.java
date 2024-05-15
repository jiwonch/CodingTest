class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int x = 0;
        
        if (n % 2 == 0) {
            answer = new int[n/2];
        } else if (n % 2 != 0) {
            answer = new int[n/2+1];
        }
        
        for ( int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[x] = i;
                x++;
            }
        }
        return answer;
    }
}