/**
* @breif num_list에서 n번째 원소부터 마지막 원소까지의 원소를 담은 리스트를 구하시오.
* @param1 int array num_list
* @param2 int n
* @return int array answer
*/


class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length - (n-1);
        int[] answer = new int[len];
        int num = 0;
    
        for (int i = n-1; i < num_list.length; i++) {
            answer[num] = num_list[i];
            num++;
        }
        return answer;
    }
}