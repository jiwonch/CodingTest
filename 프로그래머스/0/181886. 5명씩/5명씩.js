/**
* @breif 배열의 원소를 5개씩 묶어서 가장 첫번째 원소만 모아서 재배열
* @details 배열의 원소를 5개씩 묶는데, 가장 마지막 묶음이 5명이 안되어도 첫번째 원소 새로운 배열에 추가함
* @param String Array names
* @return String Array answer
*/


function solution(names) {
    var answer = [];
    var num = 0;
    for(i = 0; i < names.length; i++) {
        if(i % 5 == 0) {
            answer[num] = names[i];
            num++;
        }
    }
    return answer;
}