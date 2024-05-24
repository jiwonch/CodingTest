/**
* @brief 배열 numbers의 원소를 차례로 더하다가 n보다 값이 커지는 순간에 그 값을 리턴
* @param1 Integer array numbers
* @param2 Integer n
* @return Ingerger answer
*/

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        
        return answer;
    }
}