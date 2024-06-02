/**
* @brief 정수 배열의 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 리턴하는 함수
* @param Integer Array num_list
* @return Integer answer
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multiple = 1;
        int sum_2 = 0;
    
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multiple *= num_list[i];
            sum_2 = sum*sum;

            if (multiple < sum_2) {
                answer = 1;
            } else if (multiple > sum_2) {
                answer = 0;
            }

        } 
        
        
        return answer;
    }
}