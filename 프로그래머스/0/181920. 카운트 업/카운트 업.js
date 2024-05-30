/**
* @brief start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 리턴하는 함수
* @param1 Integer start_num
* @param2 Integer end_num
* @return Integer Array answer
*/

function solution(start_num, end_num) {
    var answer = [];
    var num = 0;
    
    for (i = start_num; i <= end_num; i++) {
        answer[num] = i;
        num++;
    }
    
    return answer;
}