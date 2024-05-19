function solution(cipher, code) {
    var answer = '';
    var num = 0;
    
    for (i = 1; i <= cipher.length; i++) {
        num = code * i - 1;
        if (num >= cipher.length) {
            break;
        }
        answer += cipher[num];
        // answer += cipher[num].toString;
    }
    
    
    return answer;
}