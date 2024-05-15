class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double temp = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            temp += numbers[i];
        }
        
        answer = temp / numbers.length;
        return answer;
    }
}