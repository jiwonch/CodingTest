/**
* @breif
* @param1
* @param2
* @return
*/

function solution(num_list, n) {
    var answer = [];
    var num = 0;
    
    for (i = n-1; i < num_list.length; i++) {
        answer[num] = num_list[i];
        num++;
    }
    return answer;
}