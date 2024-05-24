/**
* @brief 소문자를 대문자로 변환
* @details 소문자는 대문자로 대문자일 경우에는 대문자 그대로 변환
* @param String myString
* @return String answer
*/

function solution(myString) {
    var answer = '';
    const newStr = myString.split('');
    
    for (i = 0; i < newStr.length; i++) {
        answer += newStr[i].toUpperCase();
    }
    
    return answer;
}