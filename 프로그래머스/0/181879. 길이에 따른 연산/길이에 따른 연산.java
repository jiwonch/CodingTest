/**
* @brief 배열의 길이가 11이상이면 원소의 합, 10이하이면 원소읩 곱 반환
* @param Integer Array num_list
* @return Integer answer

*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else if (num_list.length <= 10) {
            answer = 1;
            for (int j = 0; j < num_list.length; j++) {
                answer *= num_list[j];
            }
        }
        
        return answer;
    }
}