/**
* @brief num_list를 n번째 원소 이후의 원소들과 n 번째까지의 원소를 나눠
*        n번째 원소 이후의 원소들을 n번째까지의 원소들 앞에 붙인 리스트를 구하시오.
* @param1 int array num_list
* @param2 int n
* @return int array answer
*/

function solution(num_list, n) {
    var answer = [];
    var num = 0;
    
    
    for (i = n; i < num_list.length; i++) {
        answer[num] = num_list[i];
        num++;
    }
    
    for (i = 0; i < n; i++) {
        answer[num] = num_list[i];
        num++;
    }
    
    return answer;
}