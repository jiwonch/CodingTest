/**
* @breif 정수 배열 num_list에서 마지막 원소가 그전 원소보다 크면 마지막 원소에서
* 그 전 원소를 뺀 값을, 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두배한 값을 추가하여 리턴하시오.
* @param Integer Array num_list
* @return Integer Array answer
*/

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        var end = num_list.length -1;
        var end_prev = num_list.length -2;

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[end] > num_list[end_prev]) {
            answer[end + 1] = num_list[end] - num_list[end_prev];
        } else {
            answer[end + 1] = num_list[end] * 2;
        }
        
        return answer;
    }
}