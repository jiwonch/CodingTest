/**
* @breif num_list의 첫번째 원소부터 n번째 원소까지의 원소를 담은 리스트를 구하세요.
* @param1 int array num_list
* @param2 int n
* @return int array answer
*/

function solution(num_list, n) {
    var answer = [];
    var num = 0;
        
    for (i = 0; i < n; i++) {
        answer[num] = num_list[i];
        num++;
    }
        
    return answer;
}