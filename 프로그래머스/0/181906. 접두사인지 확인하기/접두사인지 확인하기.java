/**
* @brief is_prefix가 my_string의 접두사라면 1을, 아니면 0 리턴하는 함수
* @param1 String my_string
* @param2 String is_prefix
* @return Integer answer
*/

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if (my_string.startsWith(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}