/**
* @brief my_string의 뒤의 n글자로 이루어진 문자열을 리턴하는 함수
* @param1 String my_string
* @param2 Integer n
* @return String answer
*/


class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}