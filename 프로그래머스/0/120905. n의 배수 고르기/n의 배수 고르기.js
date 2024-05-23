function solution(n, numlist) {
    var answer = [];
    
    for (i = 0; i < numlist.length; i++) {
        if (numlist[i] % n != 0) {
            numlist.splice(i, 1);
            i--;
        }
                
        answer = numlist;

    }
    
    return answer;
}