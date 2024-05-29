/**
* @brief 문자열 my_string의 앞의 n 글자로 이루어진 문자열을 반환하는 함수
* @param1 String my_string
* @param2 Integer n
* @return String answer
*/

function solution(my_string, n) {
    var answer = '';
    
    answer = my_string.substring(0, n);
    return answer;
}