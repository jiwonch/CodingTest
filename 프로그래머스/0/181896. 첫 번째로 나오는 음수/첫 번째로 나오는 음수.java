/**
* @breif 정수 배열이 주어질 때, 첫번째 나오는 음수의 원소의 인덱스를 리턴하시오.
* @details 음수가 없다면 -1 리턴한다.
* @param Integer Array num_list
* @return Integer answer
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}