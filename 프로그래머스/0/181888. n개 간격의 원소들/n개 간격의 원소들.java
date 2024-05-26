/**
* @breif 첫 번째 원소부터 마지막 원소까지 n개 간격으로 원소를 담은 리스트를 구하시오.
* @param1 int array num_list
* @param2 int n
* @return int array answer
*/


class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        
        if (num_list.length % n != 0) {
            len += 1;
        }
        
        int[] answer = new int[len];
        
        int num = 0;
    
        for (int i = 0; i < num_list.length; ) {
            answer[num] = num_list[i];
            i += n;
            num++;
        }
        
        return answer;
    }
}