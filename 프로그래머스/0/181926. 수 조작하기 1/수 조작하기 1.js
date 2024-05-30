/**
* @brief control를 순서대로 읽어와서 문자에 따라 n의 값을 바꾼다.
* @details control은 "w", "a", "s", "d" 4개의 문자를 이루어져있다.
* "w" - n이 1이 커진다.
* "s" - n이 1이 작아진다.
* "d" - n이 10 커진다.
* "a" - n이 10 작아진다.
* @param1 Integer n
* @param2 String control
* @return Integer answer
*/

function solution(n, control) {
    var answer = 0;
    
    for (i = 0; i < control.length; i++) {
        if (control.charAt(i) == "w") {
            n++;
        } else if (control.charAt(i) == "s") {
            n--;
        } else if (control.charAt(i) == "d") {
            n += 10;
        } else if (control.charAt(i) == "a") {
            n -= 10;
        }
    }
    
    answer = n;
    
    return answer;
}

