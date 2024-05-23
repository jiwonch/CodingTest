class Solution {
    public int[] solution(int n, int[] numlist) {
        int num = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                num++;
            } 
        }
        
        int[] answer = new int[num];
        int answer_num = 0;
        
        for (int j = 0; j < numlist.length; j++) {
            if (numlist[j] % n == 0) {
                // num++;
                answer[answer_num++] = numlist[j]; // 배열에 넣고나서 후위증가
                // answer_num++;
            } 
        }
        return answer;
    }
}