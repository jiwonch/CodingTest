/**
* @brief my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 리턴하는 함수
* @param1 String Array my_strings
* @param2 Integer Array parts
* @return String answer
*/

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        
        return answer;
    }
}