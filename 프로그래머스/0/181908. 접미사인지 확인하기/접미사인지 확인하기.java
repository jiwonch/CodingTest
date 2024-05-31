/**
* @brief is_suffix가 my_string의 접미사라면 1, 아니면 0을 리턴하는 함수
* @param1 String my_string
* @param2 String is_suffix
* @return Integer answer
*/

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        if(my_string.endsWith(is_suffix)) {
            answer = 1;
        }
        
        return answer;
    }
}