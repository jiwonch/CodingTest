class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheep = 12000;
        int drink = 2000;
        
        answer = sheep*n + (k- (n/10)) *drink;
    
        return answer;
    }
}