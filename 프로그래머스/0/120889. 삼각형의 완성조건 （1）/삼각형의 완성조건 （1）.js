function solution(sides) {
    var answer = 0;
    var num = sides[0];
    var sum = 0;
    
    for (i = 0; i < sides.length; i++){
        if (sides[i] > num) {
            num = sides[i];
        } 
        
        sum += sides[i];
    }
    sum = sum - num;

    if (num < sum) {
        answer = 1;
    } else if (num >= sum) {
        answer = 2;
    }
    return answer;
}