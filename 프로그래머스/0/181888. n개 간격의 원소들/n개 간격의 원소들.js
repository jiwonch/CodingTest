/**
* @breif 첫 번째 원소부터 마지막 원소까지 n개 간격으로 원소를 담은 리스트를 구하시오.
* @param1 int array num_list
* @param2 int n
* @return int array answer
*/

function solution(num_list, n) {
    var answer = [];
    var num = 0;
    
    for (i = 0; i < num_list.length; ) {
        answer[num] = num_list[i];
        i += n;
        num++;
    }
    return answer;
}