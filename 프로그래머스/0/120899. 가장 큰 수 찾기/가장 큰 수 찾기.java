class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (number <= array[i]) {
                number = array[i];
                answer[0] = array[i];
                answer[1] = i; 
            }
        }
        
        
        return answer;
    }
}