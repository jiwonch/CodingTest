function solution(rsp) {
    var answer = '';
    
    for (i = 0; i < rsp.length; i++) {
        var num = rsp.charAt(i);
        if (num == '2') {
            answer += "0";
        } else if (num == '0') {
            answer += "5";
        } else if (num == '5') {
            answer += "2";
        }
    }
    
    return answer;
}