class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        int iceAmericano = 5500;
        
        answer = new int[2];
        
        answer[0] = money / iceAmericano;
        answer[1] = money % iceAmericano;
        
        return answer;
    }
}