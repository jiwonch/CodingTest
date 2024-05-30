/**
* @brief my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 리턴하는 함수
* @param1 String my_string
* @param2 Integer Array index_list
* @return String answer
*/

function solution(my_string, index_list) {
    var answer = '';
    
    for (i = 0; i < index_list.length; i++) {
        answer += my_string.charAt(index_list[i]);
    }
    return answer;
}