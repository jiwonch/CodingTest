/**
* @brief 주사위를 굴려서 나온 숫자 a, b로 얻는 점수를 리턴하는 함수
* @details a, b가 모두 홀수라면  a^2 + b^2 점
           a, b 중 하나만 홀수라면 2 * (a + b)
           a, b 모두 홀수가 아니라면 |a - b|
* @param1 Integer a
* @param2 Integer b
* @return Integer answer
*/

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a*a + b*b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2*(a+b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = a - b;
            if (answer < 0) {
                answer *= -1;
            }
        }
        
        return answer;
    }
}