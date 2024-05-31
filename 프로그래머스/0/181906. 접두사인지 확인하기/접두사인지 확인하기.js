/**
* @brief is_prefix가 my_string의 접두사라면 1을, 아니면 0 리턴하는 함수
* @param1 String my_string
* @param2 String is_prefix
* @return Integer answer
*/

function solution(my_string, is_prefix) {
    var answer = 0;
    
    if(my_string.startsWith(is_prefix)) {
        answer = 1;
    }
    
    return answer;
}