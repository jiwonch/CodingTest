/**
* @brief 정수 start_num에서 정수 end_num까지 1씩 감소하는 수를 차례로 담은 리스트 리턴하시오.
* @param1 Integer start
* @param2 Integer end_num
* @return Integer Array answer
*/

class Solution {
    public int[] solution(int start, int end_num) {
        int len = 0;
        
        for (int j = start; j >= end_num; j--) {
            len++;
        }
        
        int[] answer = new int[len];
        
        var num = 0;
    
        for (int i = start; i >= end_num; i--) {
            answer[num] = i;
            num++;
        }
        
        return answer;
    }
}