function solution(my_string) {
    var answer = '';
    
    for (var c of my_string) {
        if (c === c.toUpperCase()) {
            answer += c.toLowerCase();
        } else if (c === c.toLowerCase()) {
            answer += c.toUpperCase();
        }
    }
    return answer;
}