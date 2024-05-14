class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int pizza = 7;
        
        if (n % 7 != 0) {
            answer = n / 7 + 1;
        } else {
            answer = n / 7;
        }
        return answer;
    }
}