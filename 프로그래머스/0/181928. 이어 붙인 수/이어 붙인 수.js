/**
* @brief num_list의 홀수만 순서대로 이어붙인 수와 짝수만 순서대로 이어붙인 수의 합을 리턴하는 함수
* @param Integer Array num_list
* @return Integer answer
*/

function solution(num_list) {
    var answer = 0; 
    var even = "";
    var odd = "";

    for (i = 0; i < num_list.length; i++) {
        if(num_list[i] % 2 == 0) {
            even += num_list[i];
        } else if(num_list[i] % 2 != 0) {
            odd += num_list[i];
        }
    }

    answer = parseInt(even) + parseInt(odd);
    
    return answer;
}
