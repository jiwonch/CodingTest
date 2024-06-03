/**
* @brief num_list의 홀수만 순서대로 이어붙인 수와 짝수만 순서대로 이어붙인 수의 합을 리턴하는 함수
* @param Integer Array num_list
* @return Integer answer
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += num_list[i];
            } else if(num_list[i] % 2 != 0) {
                odd += num_list[i];
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        
        
        return answer;
    }
}