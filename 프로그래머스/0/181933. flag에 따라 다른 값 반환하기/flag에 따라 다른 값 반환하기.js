/**
* @brief boolean 변수 flag가 true면 정수 a+b 반환, false이면 a-b 반환
* @param1 Integer a
* @param2 Integer b
* @param3 Boolean flag
* @return true -> a+b flase -> a-b
*/

function solution(a, b, flag) {
    var answer = 0;
    
    if (flag == true) {
        answer = a + b;
    } else if (flag == false) {
        answer = a - b;
    }
    
    return answer;
}