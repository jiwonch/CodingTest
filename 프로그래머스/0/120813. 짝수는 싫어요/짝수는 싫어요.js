function solution(n) {
    var answer = [];
    var x = 0;
    
    for (i = 0; i <= n; i++) {
        if (i % 2 != 0) {
            answer[x] = i;
            x++;
        }
    }
    
    
    
    return answer;
}