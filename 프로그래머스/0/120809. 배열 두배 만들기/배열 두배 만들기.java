class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int k = numbers.length; 
        answer = new int[k];
        
        for ( int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}