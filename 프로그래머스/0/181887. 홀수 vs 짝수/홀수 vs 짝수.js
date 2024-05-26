/**
* @breif  홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 구하시오.
* @details 단, 첫 번째 원소를 1번 원소라고 한다.
* @param Integer Array num_list
* @return Integer answer
*/

function solution(num_list) {
    var answer = 0;
    var answer1 = 0;
    var answer2 = 0;

    // length에서 -1을 하면 마지막 원소의 값을 불러와주지 못함.
    for(i = 1; i < num_list.length + 1; i++) {
        if(i % 2 != 0) {
            answer1 += num_list[i - 1];
        } else if (i % 2 == 0) {
            answer2 += num_list[i - 1];
        }
    }

    if (answer1 > answer2) {
        answer = answer1;
    } else if (answer1 < answer2) {
        answer = answer2;
    } else if (answer1 == answer2) {
        answer = answer1;
    }
    
    
    
    return answer;
}