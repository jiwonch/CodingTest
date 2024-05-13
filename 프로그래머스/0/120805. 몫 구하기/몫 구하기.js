function solution(num1, num2) {
    var answer = 0;
    
//     자바스크립트에서는 나머지 연산자가 몫만 구해주지 않는다. 완전히 계산해버림.
    answer = Math.floor(num1 / num2);
    return answer;
}