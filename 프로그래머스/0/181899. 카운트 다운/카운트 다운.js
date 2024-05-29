/**
* @brief 정수 start_num에서 정수 end_num까지 1씩 감소하는 수를 차례로 담은 리스트 리턴하시오.
* @param1 Integer start
* @param2 Integer end_num
* @return Integer Array answer
*/

function solution(start, end_num) {
    var answer = [];
    var num = 0;
    
    for (i = start; i >= end_num; i--) {
        answer[num] = i;
        num++;
    }
    
    return answer;
}