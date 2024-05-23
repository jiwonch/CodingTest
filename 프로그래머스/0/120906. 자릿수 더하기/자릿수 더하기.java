class Solution {
    public int solution(int n) {
        int answer = 0;
        int n2 = n;
        
        // while(n > 0) {
        //     answer += n % 10;
        //     n = parseInt(n / 10);
        // }
        
        // for (int i = 1; i > n2; i *= 10) {
        //     answer += n % 10;
        //     n = n / 10;
        // }
        
        // for (int i = n; i > 0; i /= 10) {
        //     answer += i % 10;
        // }
        
        for (int i = n; ; ) {
            answer += i % 10;
            
            if (i == 0) {
                break;
            }
            
            i = i / 10;
        }
        
        return answer;
    }
}