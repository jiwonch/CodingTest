/**
* @brief 입력한 정수n의 짝수 홀수 구분하는 함수
* @details n이 짝수이면 "n is even" 출력
*          n이 홀수이면 "n is odd" 출력
* @param Integer n
* @return 출력문
*/

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    n = Number(input[0]);
    
    if (n % 2 == 0) {
        console.log(n + " is even");
    } else if (n % 2 != 0) {
        console.log(n + " is odd");
    }
});
