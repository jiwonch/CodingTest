function solution(array) {
    var answer = [];
    var number = 0;
    for ( i = 0; i < array.length; i++) {
        if (number <= array[i]) {
            number = array[i];
            answer[0] = array[i];
            answer[1] = i; 
        }
    }
    return answer;
}