/**
* @brief boolean 변수 flag가 true면 정수 a+b 반환, false이면 a-b 반환
* @param1 Integer a
* @param2 Integer b
* @param3 Boolean flag
* @return true -> a+b flase -> a-b
*/

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if (flag == true) {
            answer = a + b;
        } else if (flag == false) {
            answer = a - b;
        }
        return answer;
    }
}