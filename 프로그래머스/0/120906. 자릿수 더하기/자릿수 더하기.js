function solution(n) {
    var answer = 0;
    
    while(n > 0) {
        answer += n % 10;
        n = parseInt(n / 10);
    }
    
    return answer;
}